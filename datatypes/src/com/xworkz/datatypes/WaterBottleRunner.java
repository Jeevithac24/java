package com.xworkz.datatypes;

import com.xworkz.datatypes.things.DevuBottle;
import com.xworkz.datatypes.things.GunashreeBottle;
import com.xworkz.datatypes.things.ShwethaBottle;
import com.xworkz.datatypes.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {

		GunashreeBottle bottle = new GunashreeBottle();
		bottle.drink();
		ShwethaBottle bottle1 = new ShwethaBottle();
		WaterBottle waterBottle = new WaterBottle();
		bottle1.store(waterBottle);
		DevuBottle bottle3 = new DevuBottle();
		bottle3.hold();
	}

}
