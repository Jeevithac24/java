package com.xworkz.inheritance;

import com.xworkz.inheritance.store.Bulb;
import com.xworkz.inheritance.store.Lamp;

public class LampRunner {

	public static void main(String[] args) {

		Lamp lamp=new Lamp();
		lamp.price=120;
		lamp.light();
		Bulb bulb=new Lamp();
		bulb.price=120;
		bulb.light();
		
	}

}
