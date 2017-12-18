package org.sid.service;

import java.util.List;

import org.sid.entities.DislikedShop;
import org.sid.entities.Shop;

public interface ShopService {
	public List<Shop> allShops();
	public List<Shop> shopByDistance();
	public Shop createDislikedShop(Shop s);
}
