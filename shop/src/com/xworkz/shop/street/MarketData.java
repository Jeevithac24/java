package com.xworkz.shop.street;

public class MarketData {
	private String name;
	private String location;
	
	public MarketData(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void print() {
		System.out.println("name: "+name);
		System.out.println("location: "+location);
	}
	


}
