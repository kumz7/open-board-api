package com.open.board.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.model.User;
import com.open.board.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
	}
	public User getUser(String username) {
		return userRepository.getUserByUserName(username);
	}
	@Transactional
	public void deleteUser(String username) {
		userRepository.deleteUserByUserName(username);
	}
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	
}
