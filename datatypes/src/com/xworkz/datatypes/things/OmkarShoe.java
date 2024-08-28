package com.xworkz.datatypes.things;

public class OmkarShoe {

	public void keep(Shoe shoe) {
		if (shoe != null) {
			shoe.enhanceWalk();
			System.out.println("running enhanceWalk in OmkarShoe");
			System.out.println(shoe.cost);
		} else {
			System.out.println("shoe is null");
		}
	}

}
