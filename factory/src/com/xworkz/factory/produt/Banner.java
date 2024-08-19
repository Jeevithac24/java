package com.xworkz.factory.produt;

public class Banner {

	private String materialUsed;
	private int prize;
	private int height;
	
	public Banner() {
		System.out.println("constructor with no arguments");
	}
	
	public Banner(String materialUsed,int prize,int height) {
		this.materialUsed=materialUsed;
		this.prize=prize;
		this.height=height;
	}
	
	public void print() {
		System.out.println("matreial used: "+materialUsed);
		System.out.println("prize: "+prize);
		System.out.println("height: "+height);
	}
}
