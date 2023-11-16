package com.example.board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.example.board.domain.OAuthType;
import com.example.board.domain.RoleType;
import com.example.board.domain.User;
import com.example.board.service.UserService;
import com.google.gson.Gson;

@Controller
public class KakaoLoginController {
	
	@Value("${kakao.default.password}")
	private String kakaoPassword;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/oauth/kakao")
	   public String callBack(String code) {
	      
	      HttpHeaders header = new HttpHeaders();
	      header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
	      
	      MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
	      
	      body.add("grant_type", "authorization_code");
	      body.add("client_id", "c97da230f6c4908dd2fed75aa2b55020");
	      body.add("redirect_uri", "http://localhost:8888/oauth/kakao");
	      body.add("code", code);
	      
	      HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, header);
	      
	      RestTemplate restTemplate = new RestTemplate();
	      
	      ResponseEntity<String> responseEntity =
	                     restTemplate.exchange("https://kauth.kakao.com/oauth/token",
	                                       HttpMethod.POST,
	                                       request,
	                                       String.class);
	      
	      System.out.println(responseEntity.getBody());
	      
	      String jsonData = responseEntity.getBody();
	      
	      Gson gson = new Gson();
	      
	      Map<?, ?> data = gson.fromJson(jsonData, Map.class);
	      
	      User userInfo = getUserInfo((String)data.get("access_token"));
	      
	      User findUser = userService.getUser(userInfo.getUsername());
	      System.out.println(findUser);
	      if(findUser.getUsername() == null) {
	    	  userService.insertUser(userInfo);
	      }
	      
	      UsernamePasswordAuthenticationToken token =
	    		  new UsernamePasswordAuthenticationToken(userInfo.getUsername(), userInfo.getPassword());
	      
	      Authentication authentication = authenticationManager.authenticate(token);
	      
	      SecurityContextHolder.getContext().setAuthentication(authentication);
	      
	      return "redirect:/";
	}
	
	public User getUserInfo(String accessToken) {
		
		HttpHeaders header = new HttpHeaders();
		
		header.add("Authorization", "Bearer " + accessToken);
		header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(header);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = 
				restTemplate.exchange("https://kapi.kakao.com/v2/user/me",
										HttpMethod.POST,
										request,
										String.class);
		String json = response.getBody();
		
		Gson gson = new Gson();
		
		Map<?, ?> data = gson.fromJson(json, Map.class);
		
		String username = (String) ((Map<?, ?>) data.get("properties")).get("nickname");
		String email = (String) ((Map<?, ?>) data.get("kakao_account")).get("email");
		
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(kakaoPassword);
		user.setRole(RoleType.USER);
		user.setOauth(OAuthType.KAKAO);
		
		return user;
	}

}
