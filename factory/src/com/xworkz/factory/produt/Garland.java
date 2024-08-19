package com.xworkz.factory.produt;

public class Garland {
	
	private String flowerName;
	private int cost;
	private int length;
	
	public Garland() {
		System.out.println("created constructor with no arguments");
	}
    public Garland(String flowerName,int cost,int length) {
    	this.flowerName=flowerName;
    	this.cost=cost;
    	this.length=length;
    	System.out.println("created constructor with three parameters");
    }
    
    public void display() {
    	System.out.println("flower name: "+flowerName);
    	System.out.println("cost of garland: "+cost);
    	System.out.println("length of garland: "+length);
    }
}
