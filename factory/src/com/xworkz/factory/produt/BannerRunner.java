package com.xworkz.factory.produt;

public class BannerRunner {

	public static void main(String[] args) {

		Banner banner1=new Banner("polyester",250,10);
		Banner banner2=new Banner("canvas", 120, 8);
		Banner banner3=new Banner("vinyl",200,12);
		Banner banner[]= {banner1,banner2,banner3};
		System.out.println("length of banner array: "+banner.length);
		for(int count=0;count<banner.length;count++) {
			Banner store=banner[count];
			store.print();
			
		}
		
	}

}
