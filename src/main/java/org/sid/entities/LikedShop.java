package org.sid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="likedShop")
public class LikedShop {
	
	@Id
	private String id;
	private String shop;
	private String userId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LikedShop(String shop, String userId) {
		super();
		this.shop = shop;
		this.userId = userId;
	}
	public LikedShop() {
		super();
	}
	@Override
	public String toString() {
		return "LikedShop [id=" + id + ", shop=" + shop + ", userId=" + userId + "]";
	}
	
	

}
