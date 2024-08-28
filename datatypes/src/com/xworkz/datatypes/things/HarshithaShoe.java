package com.xworkz.datatypes.things;

public class HarshithaShoe {
	public Shoe shoe;

	public void run() {
		if (shoe != null) {
			shoe.safeGuard();
			System.out.println("running safeguard in HarshithaShoe");
		} else {
			System.out.println("shoe is null");
		}

	}

}
