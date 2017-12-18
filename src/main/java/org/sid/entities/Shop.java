package org.sid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="shops")
public class Shop {
	@Id
	private String id;
	private String picture;
	private String name;
	private String email;
	private String city;
	private Location location;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Shop(String picture, String name, String email, String city, Location location) {
		super();
		this.picture = picture;
		this.name = name;
		this.email = email;
		this.city = city;
		this.location = location;
	}
	public Shop() {
		super();
	}
	@Override
	public String toString() {
		return "Shop [picture=" + picture + ", name=" + name + ", email=" + email + ", city=" + city + ", location="
				+ location + "]";
	}
	
	
	
}
