package org.sid.web;

import java.util.List;

import org.sid.entities.Shop;
import org.sid.security.SecurityConstants;
import org.sid.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;

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
	public List<Shop> listShopsByDistance(@RequestHeader(SecurityConstants.HEADER_STRING) String token){
		String userId=(String) Jwts.parser()
				.setSigningKey(SecurityConstants.SECRET.getBytes())
                .parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, ""))
                .getBody().get("id");
		return shopService.shopByDistance(userId);
	}
	
	@RequestMapping(value="/dislikedShop",method=RequestMethod.POST)
	public Shop createDislikedShop(@RequestBody Shop s,@RequestHeader(SecurityConstants.HEADER_STRING) String token){
		String userId=(String) Jwts.parser()
				.setSigningKey(SecurityConstants.SECRET.getBytes())
                .parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, ""))
                .getBody().get("id");
		return shopService.createDislikedShop(s,userId);
	}
	
	@RequestMapping(value="/likedShop",method=RequestMethod.POST)
	public Shop addLikedShop(@RequestBody Shop s,@RequestHeader(SecurityConstants.HEADER_STRING) String token){
		String userId=(String) Jwts.parser()
				.setSigningKey(SecurityConstants.SECRET.getBytes())
                .parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, ""))
                .getBody().get("id");
		return shopService.addLikedShop(s,userId);
	}
	
	@RequestMapping(value="/likedShop",method=RequestMethod.GET)
	public List<Shop> listPreferredShop(@RequestHeader(SecurityConstants.HEADER_STRING) String token){
		String userId=(String) Jwts.parser()
				.setSigningKey(SecurityConstants.SECRET.getBytes())
                .parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, ""))
                .getBody().get("id");
		return shopService.preferredShops(userId);
	}
	
	@RequestMapping(value="/likedShop/{id}",method=RequestMethod.DELETE)
	public void deleteLikedShop(@PathVariable String id,@RequestHeader(SecurityConstants.HEADER_STRING) String token){
		String userId=(String) Jwts.parser()
				.setSigningKey(SecurityConstants.SECRET.getBytes())
                .parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, ""))
                .getBody().get("id");
		shopService.deleteLikedShop(id,userId);
	}
	
	
	
	
	
	

}
