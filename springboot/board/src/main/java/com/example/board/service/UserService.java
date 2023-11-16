package com.example.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.domain.RoleType;
import com.example.board.domain.User;
import com.example.board.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void insertUser(User user) {
		user.setRole(RoleType.USER);
		
		userRepository.save(user);
	}
	
	public User getUser(String username) {
		User user = userRepository.findByUsername(username).orElseGet(() -> {
			return new User();
		});
		
		return user;
	}
	
}
