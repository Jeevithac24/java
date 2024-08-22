package com.xworkz.shop.street;

public class SideDish {

	private String name;
	private double price;
	private String type;
	public SideDish(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void display() {
		System.out.println("name: "+name);
		System.out.println("price: "+price);
		System.out.println("type: "+type);
	}
}
