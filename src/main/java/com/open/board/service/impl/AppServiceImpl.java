package com.open.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.model.User;
import com.open.board.repository.AppRepository;
import com.open.board.repository.UserRepository;

@Service
public class AppServiceImpl {
	@Autowired
	AppRepository repository;
	
}
