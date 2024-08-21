package com.xworkz.bike.store;

public class City {

	private String[] cityNames=new String[10];
	private int index;
	
	public void cityDetails(String cityNames) {
		this.cityNames[this.index]=cityNames;
		this.index++;
	}
	
	public void print() {
		for(String cityName:cityNames) {
			System.out.println("city name: "+cityName);
		}
	}
}
