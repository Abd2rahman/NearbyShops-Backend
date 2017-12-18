package org.sid.service;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.sid.dao.DislikedShopRepository;
import org.sid.dao.ShopRepository;
import org.sid.entities.DislikedShop;
import org.sid.entities.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository shopRepo;
	
	@Autowired
	private DislikedShopRepository dislikedShopRepo;

	@Override
	public List<Shop> allShops() {
		return shopRepo.findAll();
	}

	@Override
	public List<Shop> shopByDistance() {
		List<Shop> list=shopRepo.findAll();
		
		Iterator<Shop> it=list.iterator();
		
		while(it.hasNext()){
			Shop currentShop=it.next();
			if(dislikedShopRepo.findByShopId(currentShop.getId())!=null){
				it.remove();
			}
			
		}
		
		
		
		Collections.sort(list, new Comparator<Shop>(){

			@Override
			public int compare(Shop arg0, Shop arg1) {
				
				double arg0Longitude=arg0.getLocation().getCoordinates().get(0);
				double arg0Latitude=arg0.getLocation().getCoordinates().get(1);
				
				double arg1Longitude=arg1.getLocation().getCoordinates().get(0);
				double arg1Latitude=arg1.getLocation().getCoordinates().get(1);
				
				Double arg0Distance=Math.sqrt(arg0Latitude*arg0Latitude + arg0Longitude*arg0Longitude);
				Double arg1Distance=Math.sqrt(arg1Latitude*arg1Latitude + arg1Longitude*arg1Longitude);
				
				return arg0Distance.compareTo(arg1Distance);
			}
			
		});
		
		return list;
	}

	@Override
	public Shop createDislikedShop(Shop s) {
		DislikedShop _dislikedShop=new DislikedShop(s.getId(),new Timestamp(System.currentTimeMillis()));
		
		DislikedShop _dislikedShopTest=null;
		_dislikedShopTest=dislikedShopRepo.save(_dislikedShop);
		
		if(_dislikedShopTest==null){
			return null;
		}
		else return s;
		
	}
	
	

	

	

}
