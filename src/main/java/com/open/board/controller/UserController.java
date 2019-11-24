package com.open.board.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.open.board.model.User;
import com.open.board.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("registeruser")
	public User createUser(@RequestBody User user) {
		if(Optional.ofNullable(user).isPresent())
			userService.saveUser(user);
		else
			return null; 
		return user;
	}
	@GetMapping("getuser")
	public User getUser(@RequestParam("username") String username) {
		if(Optional.ofNullable(username).isPresent())
			return userService.getUser(username);
		else
			return null;
	}
	@GetMapping("deleteuser") 
	public void deleteUser(@RequestParam("username") String username) {
		if(Optional.ofNullable(username).isPresent())
			userService.deleteUser(username);
	}
	@GetMapping("getusers") 
	public Iterable<User> getAllUser() {
		 return userService.getUsers();
	}
	
}
