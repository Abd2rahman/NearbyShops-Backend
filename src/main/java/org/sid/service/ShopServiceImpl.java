package org.sid.service;

import java.util.List;

import org.sid.dao.ShopRepository;
import org.sid.entities.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository shopRepo;

	@Override
	public List<Shop> allShops() {
		return shopRepo.findAll();
	}

}
