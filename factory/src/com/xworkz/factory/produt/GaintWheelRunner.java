package com.xworkz.factory.produt;

public class GaintWheelRunner {

	public static void main(String[] args) {

		GaintWheel gaintWheel1=new GaintWheel(25,76.8,"Bangalore");
		GaintWheel gaintWheel2=new GaintWheel(27,90,"Mysore");
		GaintWheel gaintWheel3=new GaintWheel(30,88.8,"Mangalore");
		GaintWheel gaintWheel[]= {gaintWheel1,gaintWheel2,gaintWheel3};
		for(int count=0;count<gaintWheel.length;count++) {
			
			GaintWheel info=gaintWheel[count];
			info.print();
		}
	}

}
