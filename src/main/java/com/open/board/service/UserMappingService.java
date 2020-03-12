package com.open.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.model.Organization;
import com.open.board.model.User;
import com.open.board.model.UserMapping;
import com.open.board.repository.UserRepository;


public interface UserMappingService {
	public UserMapping userOrgMap(String userName,String orgName) ;
	public List<Organization> getOrganizationForUser(String userName);
	
}
