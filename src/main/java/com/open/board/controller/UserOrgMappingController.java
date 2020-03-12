package com.open.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.board.model.Organization;
import com.open.board.model.UserMapping;
import com.open.board.service.UserMappingService;

@RestController
@RequestMapping("userOrgMapping")
public class UserOrgMappingController {
	@Autowired
	UserMappingService service;
	
	@PostMapping("/{orgName}/{userName}")
	public UserMapping map(@PathVariable("orgName") String orgName, @PathVariable("userName") String userName) {
		return service.userOrgMapping(userName,orgName);
	}
}
