package com.open.board.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.open.board.model.User;

@Repository
public interface UserRepository  extends CrudRepository<User,Long>{

	@Query("FROM User WHERE username=:username")
	public User getUserByUserName(@Param("username") String username);
	
	@Modifying
	@Query("DELETE FROM User WHERE username=:username")
	public void deleteUserByUserName(@Param("username") String username);

}
