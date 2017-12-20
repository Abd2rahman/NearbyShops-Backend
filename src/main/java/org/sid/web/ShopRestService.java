package org.sid.web;

import java.util.List;

import org.sid.entities.Shop;
import org.sid.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ShopRestService {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(value="/shops",method=RequestMethod.GET)
	public List<Shop> listShops(){
		List<Shop> list=shopService.allShops();
		
		return list; 
	}
	
	@RequestMapping(value="/shopsByDistance",method=RequestMethod.GET)
	public List<Shop> listShopsByDistance(){
		return shopService.shopByDistance();
	}
	
	@RequestMapping(value="/dislikedShop",method=RequestMethod.POST)
	public Shop createDislikedShop(@RequestBody Shop s){
		return shopService.createDislikedShop(s);
	}
	
	@RequestMapping(value="/likedShop",method=RequestMethod.POST)
	public Shop addLikedShop(@RequestBody Shop s){
		return shopService.addLikedShop(s);
	}
	
	@RequestMapping(value="/likedShop",method=RequestMethod.GET)
	public List<Shop> listPreferredShop(){
		return shopService.preferredShops();
	}
	
	@RequestMapping(value="/likedShop/{id}",method=RequestMethod.DELETE)
	public void deleteLikedShop(@PathVariable String id){
		shopService.deleteLikedShop(id);
	}
	
	
	
	
	
	

}
