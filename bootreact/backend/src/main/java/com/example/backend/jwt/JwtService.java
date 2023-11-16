package com.example.backend.jwt;

import java.security.Key;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {
	
	// 토큰 만료 시간
	static final long EXPIRATIONTIME = 24 * 60 * 60 * 1000;
	// jwt에서 헤더에 사용할 접두어
	static final String PREFIX = "Bearer";
	// 서명에 사용될 암호화시킨 key
	static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	
	// jwt발급해주는 메서드
	public String getToken(String username) {
		String token = Jwts.builder()
				.setSubject(username) // jwt 클레임 설정
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME)) // 토큰 만료시간
				.signWith(key) // 서명
				.compact();
		
		return token;
	}
	
	// 토큰 추출해서 검사, 사용자 이름을 리턴
	public String getAuthUser(HttpServletRequest request) {
		
		String token = request.getHeader(HttpHeaders.AUTHORIZATION);
		
		if(token != null) {
			String user = Jwts.parserBuilder()
					.setSigningKey(key)
					.build()
					.parseClaimsJws(token.replace(PREFIX, ""))
					.getBody()
					.getSubject();
			
			if(user != null)
				return user;
		}
		
		return null;
	}
}
