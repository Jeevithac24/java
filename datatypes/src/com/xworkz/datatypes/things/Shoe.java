package com.xworkz.datatypes.things;

public class Shoe {
	public String brand = "bata";
	public double cost = 12000;

	public Shoe() {

		System.out.println("created shoe constructor with no-arg...");

	}

	public void safeGuard() {
		System.out.println("running safeGuard...");
	}

	public void enhanceWalk() {
		System.out.println("running enhanceWalk...");
	}

}
