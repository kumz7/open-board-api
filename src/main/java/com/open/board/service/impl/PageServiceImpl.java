package com.open.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.model.User;
import com.open.board.repository.PageRepository;
import com.open.board.repository.UserRepository;

@Service
public class PageServiceImpl {
	@Autowired
	PageRepository repository;
	
	
}
