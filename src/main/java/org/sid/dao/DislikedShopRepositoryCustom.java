package org.sid.dao;

import org.sid.entities.DislikedShop;

public interface DislikedShopRepositoryCustom {
	
	public DislikedShop findByShopId(String id,String userId);

}
