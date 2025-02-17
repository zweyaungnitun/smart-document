package com.smartai.documentmanagement.controller;

import java.util.Optional;

import org.springframework.ai.chat.client.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartai.documentmanagement.entity.User;
import com.smartai.documentmanagement.service.UserService;

import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
	
	private final UserService userService;
	@PostMapping
	public ResponseEntity<User>  registerUser(User user) {
		return userService.save(user);
	}
	
	public Optional<User> getUserById(Long id) {
		return userService.getUserById(id);
	}

}
