package com.open.board.constants;

public class ConstantQuery {
	/*
	 * User Repository
	 */
	public static final String UserRepositorygetUserByUserName		= "FROM User WHERE name=:name";
	public static final String UserRepositorygetUserByEmail 		= "FROM User WHERE email=:email";
	public static final String ConstantQuerydeleteUserByUserName 	= "DELETE FROM User WHERE name=:name";
}
