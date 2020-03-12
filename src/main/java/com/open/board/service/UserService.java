package com.open.board.service;

import java.util.List;

import com.open.board.model.User;

public interface UserService {
	public User createOrUpdate(User user); 
	public User getUser(String emailOrName);
	public <U>boolean deleteUser(U user);
	public List<User> getAllUser();
}
