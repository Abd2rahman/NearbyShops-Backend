package org.sid.dao;

import org.sid.entities.DislikedShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class DislikedShopRepositoryImpl implements DislikedShopRepositoryCustom {
	
	@Autowired
	private MongoTemplate mt;

	@Override
	public DislikedShop findByShopId(String id) {
		// TODO Auto-generated method stub
		Query query=new Query();
		query.addCriteria(Criteria.where("shop").is(id));
		return mt.findOne(query, DislikedShop.class);
	}

}
