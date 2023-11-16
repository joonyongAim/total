package com.example.backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.domain.Member;
import com.example.backend.domain.MemberCredentials;
import com.example.backend.jwt.JwtService;
import com.example.backend.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody Member member) {
		
		memberService.signup(member);
		
		return new ResponseEntity<>("회원가입 완료", HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody MemberCredentials cred) {
		
		return memberService.getResponseEntity(cred.getUsername(), cred.getPassword());
		
	}
	
	@PostMapping("/oauth/google")
	public ResponseEntity<?> googleLogin(@RequestBody Map<String, String> accessToken) {
		
		Member member = memberService.googleLogin(accessToken.get("accessToken"));
		
		Member findMember = memberService.getMember(member.getUsername());
		
		if(findMember.getUsername() == null) {
			memberService.signup(member);
		}
		
		return memberService.getResponseEntity(member.getUsername(), member.getPassword());
	}
	
	@PostMapping("/oauth/kakao")
	public ResponseEntity<?> kakaoLogin(@RequestBody Map<String, String> kakaoCode) {
		
		String code = kakaoCode.get("code");
		
		String accessToken = memberService.getKakaoAccessToken(code);
		
		Member userInfo = memberService.kakaoLogin(accessToken);
		
		System.out.println(userInfo);
		
		Member findMember = memberService.getMember(userInfo.getUsername());
		
		if(findMember.getUsername() == null)
			memberService.signup(userInfo);
		
		return memberService.getResponseEntity(userInfo.getUsername(), userInfo.getPassword());
	}
	
	@GetMapping("/userInfo")
	public ResponseEntity<?> userInfo(Authentication authentication) {
		
		String uername = authentication.getName();
		
		Member member = memberService.getMember(uername);
		
		return new ResponseEntity<>(member, HttpStatus.OK);
	}
	
}
