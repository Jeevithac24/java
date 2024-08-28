package com.xworkz.datatypes.things;

public class GunashreeBottle {

	public void drink() {
		System.out.println("running drink in GunashreeBottle...");
		WaterBottle waterBottle = new WaterBottle();
		waterBottle.quantity = 5;
		waterBottle.color = "grey";
		System.out.println(waterBottle.quantity);
		System.out.println(waterBottle.color);
	}

}
