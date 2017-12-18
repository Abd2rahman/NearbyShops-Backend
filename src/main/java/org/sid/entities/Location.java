package org.sid.entities;

import java.util.List;

public class Location {
	
	private String type;
	private List<Double> coordinates;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Double> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}
	public Location(String type, List<Double> coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	
	public Location() {
		super();
	}
	@Override
	public String toString() {
		return "Location [type=" + type + ", coordinates=" + coordinates + "]";
	}
	
	
	
	
	
	
	
	

}
