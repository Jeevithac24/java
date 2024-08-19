package com.xworkz.factory.produt;

public class GaintWheel {

	private int noOfSeats;
	private double height;
	private String location;
	
	public GaintWheel() {
		System.out.println("creted constructor with no arguments");
	}
	
	public GaintWheel(int noOfSeats,double height,String location) {
		
		this.noOfSeats=noOfSeats;
		this.height=height;
		this.location=location;
	}
	
	public void print () {
		
		System.out.println("no of seats: "+noOfSeats);
		System.out.println("height of gaint wheel: "+height);
		System.out.println("location of gaint wheel: "+location);
	}
}
