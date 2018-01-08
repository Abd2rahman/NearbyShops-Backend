package org.sid.dao;

import org.sid.entities.LikedShop;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class UserRepositoryImpl implements UserRepositoryCustom {
	
	
	@Autowired
	private MongoTemplate mt;

	@Override
	public User findByUsername(String username) {
		Query query=new Query();
		query.addCriteria(Criteria.where("username").is(username));
		return mt.findOne(query, User.class);
	}
	
}
