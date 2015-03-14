package com.spring.security.users.dao;

import com.spring.security.users.model.UserAttempts;


public interface UserDetailsDao {

	public void updateFailAttempts(String username);
	public void resetFailAttempts(String username);
	UserAttempts getUserAttempts(String username);
}
