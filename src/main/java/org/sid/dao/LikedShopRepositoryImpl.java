package org.sid.dao;

import org.sid.entities.LikedShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class LikedShopRepositoryImpl implements LikedShopRepositoryCustom {
	
	@Autowired
	private MongoTemplate mt;

	@Override
	public LikedShop findByShopId(String id) {
		Query query=new Query();
		query.addCriteria(Criteria.where("shop").is(id));
		
		return mt.findOne(query, LikedShop.class);
	}

}
