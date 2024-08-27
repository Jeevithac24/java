package com.xworkz.inheritance;

import com.xworkz.inheritance.store.Halwa;
import com.xworkz.inheritance.store.Kheer;

public class KheerRunner {

	public static void main(String[] args) {

		Kheer kheer=new Kheer();
		kheer.name="carrot halwa";
		kheer.quantity=2.5;
		kheer.dryFruits=true;
		kheer.consistency();
		kheer.sweetness();
		Halwa halwa=new Kheer();
		halwa.name="pumpkin halwa";
		halwa.quantity=2.5;
		halwa.dryFruits=true;
		halwa.consistency();
		halwa.sweetness();
		
		
	}

}
