package com.example.backend.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.backend.domain.Member;
import com.example.backend.domain.RoleType;
import com.example.backend.jwt.JwtService;
import com.example.backend.repository.MemberRepository;
import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	@Value("${google.default.password}")
	private String googlePassword;
	
	@Value("${kakao.default.password}")
	private String kakaoPassword;
	
	public void signup(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		member.setRole(RoleType.USER);
		
		memberRepository.save(member);
	}
	
	public Member googleLogin(String token) {
		RestTemplate restTemplate = new RestTemplate();
		
		String userInfoEndPoint = "https://www.googleapis.com/oauth2/v1/userinfo";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "Bearer " + token);
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(header);
		
		ResponseEntity<String> response = restTemplate.exchange(userInfoEndPoint, HttpMethod.GET, request, String.class);
		
		String userInfo = response.getBody();
		
		Gson gson = new Gson();
		Map<?, ?> data = gson.fromJson(userInfo, Map.class);
		
		Member member = new Member();
		
		member.setUsername((String) data.get("name"));
		member.setEmail((String) data.get("email"));
		member.setPassword(googlePassword);
		
		return member;
	}
	
	public Member getMember(String username) {
		return memberRepository.findByUsername(username).orElseGet(() -> {
			return new Member();
		});
	}
	
	public ResponseEntity<?> getResponseEntity(String username, String password) {
		UsernamePasswordAuthenticationToken upaToken = 
				new UsernamePasswordAuthenticationToken(username, password);
		
		Authentication auth = authenticationManager.authenticate(upaToken);
		
		String jwt = jwtService.getToken(auth.getName());
		
		return ResponseEntity.ok()
					.header(HttpHeaders.AUTHORIZATION, "Bearer " + jwt)
					.header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization")
					.build();
	}
	
	public String getKakaoAccessToken(String code) {
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("grant_type", "authorization_code");
		body.add("client_id", "c97da230f6c4908dd2fed75aa2b55020"); // 각자 rest api key
		body.add("redirect_uri", "http://localhost:3000/oauth/kakao");
		body.add("code", code);
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, header);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate.exchange("https://kauth.kakao.com/oauth/token",
																	HttpMethod.POST,
																	request,
																	String.class
																);
		
		String json = response.getBody();
		
		Gson gson = new Gson();
		Map<?, ?> data = gson.fromJson(json, Map.class);
		
		return (String) data.get("access_token");
	}
	
	public Member kakaoLogin(String accessToken) {
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "Bearer " + accessToken);
	    header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
	    
	    HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(header);
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    ResponseEntity<String> response = 
	    		restTemplate.exchange(
	    				"https://kapi.kakao.com/v2/user/me",
	    				HttpMethod.POST,
	    				request,
	    				String.class
	    							);
	    String json = response.getBody();
	    Gson gson = new Gson();
	    Map<?, ?> data = gson.fromJson(json, Map.class);
	    
	    String username = (String) ( (Map<?, ?>) data.get("properties") ).get("nickname");
	    String email = (String) ( (Map<?, ?>) data.get("kakao_account") ).get("email");
	    
	    Member member = new Member();
	    member.setUsername("k"+ username);
	    member.setEmail(email);
	    member.setPassword(kakaoPassword);
	    
	    return member;
	}
	
}
