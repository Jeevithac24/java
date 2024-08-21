package com.xworkz.bike.store;

public class River {
	
	private String[] riverNames=new String[10];
	private int index;
	
	public void riverDetails(String riverNames) {
		this.riverNames[this.index]=riverNames;
		this.index++;
	}
	
	public void print() {
		for(String riverName:riverNames) {
			System.out.println("river name: "+riverName);
		}
	}

}
