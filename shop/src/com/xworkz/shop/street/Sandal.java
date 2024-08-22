package com.xworkz.shop.street;

public class Sandal {
	private String brand;
	private int size;
	private String color;
	private double cost;

	public Sandal(String brand, int size, String color, double cost) {
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.cost = cost;
	}
	
	public void display() {
		System.out.println("brand: "+brand);
		System.out.println("size: "+size);
		System.out.println("color: "+color);
		System.out.println("cost: "+cost);
		
	}

}
