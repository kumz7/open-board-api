package com.open.board.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.log.Logger;
import com.open.board.model.Organization;
import com.open.board.model.User;
import com.open.board.model.UserMapping;
import com.open.board.repository.OrganizationRepository;
import com.open.board.repository.UserMappingRepository;
import com.open.board.repository.UserRepository;
import com.open.board.service.OrganizationService;
import com.open.board.service.UserMappingService;
import com.open.board.service.UserService;

@Service
public class UserMappingServiceImpl implements UserMappingService{
	@Autowired
	UserMappingRepository repository;
	
	@Autowired
	OrganizationService orgS;
	
	@Autowired
	UserService userS;
	
	public List<Organization> getOrganizationForUser(String userName){
		return IterableUtils.toList(repository.getOrganizationForUser(userName));
	} 
	public UserMapping userOrgMap(String userName,String orgName) {
		return repository.save(getUM(userName, orgName));
	}
	
	public Boolean userOrgUnmap(String userName,String orgName) {
		try {
			repository.unMap(userName,orgName);
			return true;
		}
		catch(Exception e) {
			Logger.Log(e);
			return false;
		}
	}

	public UserMapping getUM(String userName,String orgName) {
		UserMapping um = new UserMapping();

		um.setOrg(
				orgS.getOrganizationByName(orgName)
				);
		um.setUser(
				userS.getUser(userName)
				);
		return um;
	}
}
