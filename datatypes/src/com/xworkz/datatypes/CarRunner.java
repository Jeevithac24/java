package com.xworkz.datatypes;

import com.xworkz.datatypes.things.AdhiCar;
import com.xworkz.datatypes.things.Car;
import com.xworkz.datatypes.things.JeevithaCar;
import com.xworkz.datatypes.things.PallaviCar;

public class CarRunner {

	public static void main(String[] args) {

		JeevithaCar car1 = new JeevithaCar();
		car1.car = new Car();
		car1.drive();
		PallaviCar car2 = new PallaviCar();
		Car car = new Car();
		car2.wash(car);
		AdhiCar car3 = new AdhiCar();
		car3.buy();
	}

}
