package com.xworkz.datatypes.things;

public class Car {
	public String name="kreta";
	public double cost=2500000;

	public Car() {

		System.out.println("created car constructor with no arg...");

	}

	public void move() {
		System.out.println("running move in car");
	}

	public void space() {
		System.out.println("running space in car");
	}

	public void shelter() {
		System.out.println("running shelter in car");
	}

}
