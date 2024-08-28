package com.xworkz.datatypes.things;

public class ShwethaBottle {
	public void store(WaterBottle waterBottle) {
		if (waterBottle != null) {
			waterBottle.fill();
			waterBottle.empty();
		} else {
			System.out.println("water bottle is null");
		}
	}

}
