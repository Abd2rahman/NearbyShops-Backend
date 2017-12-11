package org.sid.web;

import java.util.List;

import org.sid.entities.Shop;
import org.sid.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ShopRestService {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(value="/shops",method=RequestMethod.GET)
	public List<Shop> listResponsableEcole(){
		return shopService.allShops(); 
	}

}
