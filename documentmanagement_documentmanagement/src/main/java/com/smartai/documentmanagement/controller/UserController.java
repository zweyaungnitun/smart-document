package com.smartai.documentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	@PostMapping
	public ResponseEntity<User>  registerUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.save(user));
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id){
		User user = userService.getUserById(id)
				.orElseThrow(()-> new RuntimeException("User not found with ID"+id));
		return ResponseEntity.ok(user);
	}
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
		User updateUser= userService.update(id, userDetails);
		return ResponseEntity.ok(updateUser);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {
	    userService.deleteUser(id);
	    return ResponseEntity.ok("User deleted successfully!");
	}

}
