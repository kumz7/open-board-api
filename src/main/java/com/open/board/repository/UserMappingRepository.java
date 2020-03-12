package com.open.board.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.open.board.model.Organization;
import com.open.board.model.User;
import com.open.board.model.UserMapping;

@Repository
public interface UserMappingRepository  extends CrudRepository<UserMapping,Long>{
	@Query("from Organization org inner join UserMapping um on org.orgId=um.org.orgId inner join User u on um.user.userId=u.userId where u.name=:user ") 
	public Iterable<Organization> getOrganizationForUser(@Param(value = "user") String user);
	
	@Query("from Organization org inner join UserMapping um on org.orgId=um.org.orgId inner join User u on um.user.userId=u.userId where org.name=:org ") 
	public Iterable<Organization> getUserForOrganization(@Param(value = "org") String org);
	
	@Modifying
	@Transactional 
	@Query("DELETE from User u,Organization org, UserMapping um where u.name=:userName and org.name=:orgName and u.userId=um.user.userId and org.orgId=um.org.orgId") 
	public void unMap(@Param(value = "userName") String userName,@Param(value = "orgName") String orgName);

	
	
}
