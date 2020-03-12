package com.open.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.board.model.Organization;
import com.open.board.model.User;
import com.open.board.repository.UserRepository;


public interface OrganizationService {
	public Organization getOrganizationByName(String org);
	public Organization createOrUpdateOrganization(Organization org);
	public Boolean deleteOrganization(String org);
	public List<Organization> getAllOrganization();
	
}
