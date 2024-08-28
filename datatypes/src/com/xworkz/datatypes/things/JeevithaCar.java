package com.xworkz.datatypes.things;

public class JeevithaCar {
	public Car car;

	public void drive() {
		if(car!=null) {
		System.out.println("running drive in jeevitha car");
		System.out.println(car.name);
		System.out.println(car.cost);
		}
		else {
			System.out.println("car is null");
		}

	}

}
