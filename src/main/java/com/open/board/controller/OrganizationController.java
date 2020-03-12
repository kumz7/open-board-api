package com.open.board.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.open.board.model.Organization;
import com.open.board.model.User;
import com.open.board.service.OrganizationService;
import com.open.board.service.UserMappingService;
import com.open.board.service.UserService;

@RestController
@RequestMapping("organization")
public class OrganizationController {
	@Autowired
	OrganizationService service;
	
	@Autowired
	UserMappingService umService;
	
	@PostMapping()
	public Organization createOrganization(@RequestBody Organization org) {
		return service.createOrUpdateOrganization(org);
	}
	@PutMapping() 
	public Organization updateOrganization(@RequestBody Organization org) {
		return service.createOrUpdateOrganization(org);
	}
	@DeleteMapping(path="/{nameOrEmail}") 
	public Boolean deleteOrganization(@PathVariable String nameOrEmail) {
		return service.deleteOrganization(nameOrEmail); 
	}
	@GetMapping("/all")
	public List<Organization> getAllOrganization() {
		return service.getAllOrganization();
	}
	
	@GetMapping()
	public List<Organization> test(){
		return umService.getOrganizationForUser("kumaran"); 
	}
}
