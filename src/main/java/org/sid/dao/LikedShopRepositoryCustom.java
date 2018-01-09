package org.sid.dao;

import java.util.List;

import org.sid.entities.LikedShop;

public interface LikedShopRepositoryCustom {
	public LikedShop findByShopId(String id, String userId);
	public List<LikedShop> findAllByUserId(String userId); 
}
