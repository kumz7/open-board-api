package com.open.board.service.impl;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.log.Logger;
import com.open.board.model.Organization;
import com.open.board.model.User;
import com.open.board.repository.OrganizationRepository;
import com.open.board.repository.UserRepository;
import com.open.board.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	@Autowired
	OrganizationRepository repository;

	public Organization getOrganizationByName(String org) {
		return repository.getOrganizationByName(org);
	}
	public Organization createOrUpdateOrganization(Organization org) {
		return repository.save(org);
	}
	public Boolean deleteOrganization(String org) {
		try {
		repository.deleteOrganizationByName(org);
		}
		catch (Exception e) {
			// TODO: handle exception
			Logger.Log(e);
			return false;
		}
		return true;
	}	
	public List<Organization> getAllOrganization(){
		return IterableUtils.toList(repository.findAll());
	}
	
}
