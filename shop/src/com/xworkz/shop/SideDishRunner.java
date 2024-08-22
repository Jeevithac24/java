package com.xworkz.shop;

import com.xworkz.shop.street.SideDish;
import com.xworkz.shop.street.SideDishStore;

public class SideDishRunner {
	
	public static void main(String[] args) {
		SideDishStore dish=new SideDishStore();
		dish.show();
		SideDish data1=new SideDish("gobi manchurian", 60, "veg");
		data1.display();
		SideDish data2=new SideDish("chicken manchurian", 60, "non veg");
		data2.display();
		SideDish data3=new SideDish("papad", 60, "veg");
		data3.display();
		SideDish data4=new SideDish("sweet", 60, "veg");
		data4.display();
		SideDish data5=new SideDish("kabbab", 60, "non veg");
		data5.display();
	}

}
