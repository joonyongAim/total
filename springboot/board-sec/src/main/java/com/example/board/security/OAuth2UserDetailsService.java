package com.example.board.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.example.board.domain.OAuthType;
import com.example.board.domain.RoleType;
import com.example.board.domain.User;
import com.example.board.service.UserService;

@Service
public class OAuth2UserDetailsService extends DefaultOAuth2UserService {
	
	@Autowired
	private UserService userService;
	
	@Value("${google.default.password}")
	private String googlePassword;
	
	// 사용자가 구글 로그인을 하면 구글에서 코드 발급
	// 발급 받은 코드를 이용해서 엑세스 토큰을 발급
	// 엑세스토큰이 저장된 OAuth2UserRequest 객체를 받음
	// OAuth2가 저 발급받은 객체를 loadUser 넘기면서

	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		// TODO Auto-generated method stub
		OAuth2User oAuth2User = super.loadUser(userRequest);
		
		String id = oAuth2User.getAttribute("sub");
		String email = oAuth2User.getAttribute("email");
		String username = email + "_" + id;
		
		User findUser = userService.getUser(username);
		
		if(findUser.getUsername() == null) {
			findUser.setUsername(username);
			findUser.setPassword(googlePassword);
			findUser.setEmail(email);
			findUser.setRole(RoleType.USER);
			findUser.setOauth(OAuthType.GOOGLE);
			
			userService.insertUser(findUser);
		}
		
		return new UserDetailsImpl(findUser, oAuth2User.getAttributes());
	}
	
	

}
