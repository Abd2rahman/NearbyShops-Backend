package org.sid.dao;

import org.sid.entities.LikedShop;

public interface LikedShopRepositoryCustom {
	public LikedShop findByShopId(String id);
}
