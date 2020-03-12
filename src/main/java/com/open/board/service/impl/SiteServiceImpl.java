package com.open.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.model.User;
import com.open.board.repository.SiteRepository;
import com.open.board.repository.UserRepository;

@Service
public class SiteServiceImpl {
	@Autowired
	SiteRepository repository;
	
	
}
