package org.sid.service;

import java.util.List;

import org.sid.entities.DislikedShop;
import org.sid.entities.Shop;

public interface ShopService {
	public List<Shop> allShops();
	public List<Shop> shopByDistance();
	public List<Shop> preferredShops();
	public Shop createDislikedShop(Shop s);
	public Shop addLikedShop(Shop s);
	public void deleteLikedShop(String id);
}
