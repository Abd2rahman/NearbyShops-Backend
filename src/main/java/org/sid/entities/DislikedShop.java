package org.sid.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection="dislikedShop")
public class DislikedShop {
	
	@Id
	private String id;
	private String shop;
	
	@DateTimeFormat(iso=ISO.DATE_TIME)
	@Indexed(name="expire_after_seconds_index",expireAfterSeconds=60)
	private Date date;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DislikedShop(String shop, Date date) {
		super();
		this.shop = shop;
		this.date = date;
	}

	public DislikedShop() {
		super();
	}

	@Override
	public String toString() {
		return "DislikedShop [id=" + id + ", shop=" + shop + ", date=" + date + "]";
	}
	
	
	
	
	
	

}
