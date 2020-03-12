package com.open.board.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.open.board.constants.ConstantQuery;
import com.open.board.model.User;

@Repository
public interface UserRepository  extends CrudRepository<User,Long>{

	@Query(ConstantQuery.UserRepositorygetUserByUserName) 
	public User getUserByUserName(@Param("name") String username);
	
	@Query(ConstantQuery.UserRepositorygetUserByEmail)
	public User getUserByEmail(@Param("email") String username);
	
	@Transactional
	@Modifying(flushAutomatically=true,clearAutomatically=true)
	@Query(ConstantQuery.ConstantQuerydeleteUserByUserName)
	public void deleteUserByUserName(@Param("name") String username);

}
