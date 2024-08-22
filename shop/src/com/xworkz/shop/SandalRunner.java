package com.xworkz.shop;

import com.xworkz.shop.street.Sandal;
import com.xworkz.shop.street.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {

		SandalStore sandalStore=new SandalStore();
		sandalStore.show();
		Sandal sandal1=new Sandal("bata", 9, "black", 1000);
		sandal1.display();
		Sandal sandal2=new Sandal("brikenstock", 7, "red", 560);
		sandal2.display();
		Sandal sandal3=new Sandal("relaxo", 8, "white", 300);
		sandal3.display();
		Sandal sandal4=new Sandal("puma", 10, "grey", 2000);
		sandal4.display();
		Sandal sandal5=new Sandal("reebok", 7, "green", 700);
		sandal5.display();
		
	}

}
