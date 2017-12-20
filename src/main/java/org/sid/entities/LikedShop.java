package org.sid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="likedShop")
public class LikedShop {
	
	@Id
	private String id;
	private String shop;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public LikedShop(String shop) {
		super();
		this.shop = shop;
	}
	public LikedShop() {
		super();
	}
	@Override
	public String toString() {
		return "LikedShop [id=" + id + ", shop=" + shop + "]";
	}
	
	

}
