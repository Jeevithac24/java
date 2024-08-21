package com.xworkz.bike.store;

public class Sweet {
	
	private String[] sweetNames=new String[10];
	private int place;
	
	public void sweetDetails(String sweetNames) {
		this.sweetNames[this.place]=sweetNames;
		this.place++;
	}
	
	public void print() {
		for(String sweetName:sweetNames) {
			System.out.println("sweet name: "+sweetName);
		}
	}
	

}
