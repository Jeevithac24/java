package com.xworkz.datatypes.things;

public class PallaviCar {

	public void wash(Car car) {
		if (car != null) {
			car.move();
			System.out.println("running wash in pallavi car");
		} else {
			System.out.println("car is null");
		}

	}

}
