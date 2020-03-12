package com.open.board.service.impl;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.constants.RegEx;
import com.open.board.log.Logger;
import com.open.board.model.User;
import com.open.board.repository.UserRepository;
import com.open.board.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;
	
	public User createOrUpdate(User user) {
		return repository.save(user);
	}
	
	public User getUser(String emailOrName) {
		if(emailOrName.matches(RegEx.emailValidation))
			return repository.getUserByEmail(emailOrName);
		else
			return repository.getUserByUserName(emailOrName);
	}
	public List<User> getAllUser(){
		return IterableUtils.toList(repository.findAll());
	}
	public <U>boolean deleteUser(U user) {
		try {
			if(user instanceof User) 
				repository.delete((User) user);
			else if(user instanceof String)
				repository.deleteUserByUserName(String.valueOf(user));
		}catch(Exception e) {
			Logger.Log(e);
			return false;
		}
		return true;
		
	}
}