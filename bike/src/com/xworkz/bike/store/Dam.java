package com.xworkz.bike.store;

public class Dam {
	
	private String[] damNames=new String[10];
	private int value;
	
	public void damDetails(String damNames) {
		this.damNames[this.value]=damNames;
		this.value++;
	}
	
	public void display() {
		for(String damName:damNames) {
			System.out.println("dam name: "+damName);
		}
	}

}
