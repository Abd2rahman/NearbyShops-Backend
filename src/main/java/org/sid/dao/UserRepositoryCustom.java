package org.sid.dao;

import org.sid.entities.User;

public interface UserRepositoryCustom {
	
	User findByUsername(String username);

}
