package org.sid;

import java.util.List;

import org.sid.dao.DislikedShopRepository;
import org.sid.dao.ShopRepository;
import org.sid.entities.DislikedShop;
import org.sid.entities.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NearbyShopsBackendApplication implements CommandLineRunner { 
	
	@Autowired 
	ShopRepository shopRepo; 
	
	@Autowired
	DislikedShopRepository dislikedShopRepo;
	
	  

	public static void main(String[] args) {
		SpringApplication.run(NearbyShopsBackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*List<Shop> list=shopRepo.findAll();
		
		Shop sh=shopRepo.findOne("1");
		System.out.println(sh);
		System.out.println("ddddd");*/
		
		DislikedShop shop=dislikedShopRepo.findByShopId("5a0c6b");
		System.out.println(shop);
		
		
	}  
}        
     