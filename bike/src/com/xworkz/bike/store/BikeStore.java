package com.xworkz.bike.store;

public class BikeStore {
	
	private String[] bikes=new String[7];
	private int bikePosition;
	
	public void bikeInformation(String bikes) {
		this.bikes[this.bikePosition]=bikes;
		this.bikePosition++;
	}
	
	public void display() {
		for(String bike:bikes) {
			System.out.println(bike);
		}
	}

}
