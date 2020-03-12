package com.open.board.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.open.board.model.Organization;
import com.open.board.model.User;

@Repository
public interface OrganizationRepository  extends CrudRepository<Organization,Long>{
 
	@Query("FROM Organization WHERE name=:name")
	public Organization getOrganizationByName(@Param("name") String orgName);
		
	@Modifying(flushAutomatically=true,clearAutomatically=true)
	@Query("DELETE FROM Organization WHERE name=:name")
	public void deleteOrganizationByName(@Param("name") String name);

}
