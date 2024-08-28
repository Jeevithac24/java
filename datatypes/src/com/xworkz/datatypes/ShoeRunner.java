package com.xworkz.datatypes;

import com.xworkz.datatypes.things.DivyaShoe;
import com.xworkz.datatypes.things.HarshithaShoe;
import com.xworkz.datatypes.things.OmkarShoe;
import com.xworkz.datatypes.things.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {

		DivyaShoe divyaShoe = new  DivyaShoe();
		divyaShoe.wear();
		OmkarShoe omkarShoe=new OmkarShoe();
		Shoe shoe=new Shoe();
		omkarShoe.keep(shoe);
		HarshithaShoe harshithaShoe=new HarshithaShoe();
		harshithaShoe.shoe=new Shoe();
		harshithaShoe.run();
	}

}
