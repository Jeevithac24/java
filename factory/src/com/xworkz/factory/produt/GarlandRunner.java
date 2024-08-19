package com.xworkz.factory.produt;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland garland1=new Garland("marigold",100,2);
		Garland garland2=new Garland("rose",50,5);
		Garland garland3=new Garland("jasmine",25,3);
		Garland[] garland= {garland1,garland2,garland3};
		for(int start=0;start<garland.length;start++){
			Garland garlands=garland[start];
			garlands.display();
		}
		

	}

}
