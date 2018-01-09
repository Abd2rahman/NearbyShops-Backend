package org.sid.service;

import java.util.List;

import org.sid.entities.DislikedShop;
import org.sid.entities.Shop;

public interface ShopService {
	public List<Shop> allShops();
	public List<Shop> shopByDistance(String userId);
	public List<Shop> preferredShops(String userId);
	public Shop createDislikedShop(Shop s,String userId);
	public Shop addLikedShop(Shop s,String userId);
	public void deleteLikedShop(String id,String userId);
}
