package com.xworkz.bike;

import com.xworkz.bike.store.River;

public class RiverRunner {

	public static void main(String[] args) {

		River river=new River();
		river.riverDetails("ganga");
		river.riverDetails("narmada");
		river.riverDetails("indus");
		river.riverDetails("bhramaputra");
		river.riverDetails("yamuna");
		river.riverDetails("cauvery");
		river.riverDetails("krishna");
		river.riverDetails("mahanadi");
		river.riverDetails("tapti");
		river.riverDetails("chenab");
		river.print();

	}

}
