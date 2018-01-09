package org.sid.dao;

import java.util.List;

import org.sid.entities.LikedShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class LikedShopRepositoryImpl implements LikedShopRepositoryCustom {
	
	@Autowired
	private MongoTemplate mt;

	@Override
	public LikedShop findByShopId(String id,String userId) {
		Query query=new Query();
		query.addCriteria(Criteria.where("shop").is(id).and("userId").is(userId));
		
		return mt.findOne(query, LikedShop.class);
	}

	@Override
	public List<LikedShop> findAllByUserId(String userId) {
		Query query=new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		
		return mt.find(query, LikedShop.class);
	}

	

}
