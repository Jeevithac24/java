package com.xworkz.factory.produt;

public class VedioGameRunner {

	public static void main(String[] args) {
		VedioGame vedioGame1=new VedioGame(4,"ubisoft",false);
		VedioGame vedioGame2=new VedioGame(2, "microsoft", false);
		VedioGame vedioGame3=new VedioGame(6, "2k", true);
		VedioGame[] vedioGame= {vedioGame1,vedioGame2,vedioGame3};
		System.out.println("length of vedio game array: "+vedioGame.length);
		for(int point=0; point<vedioGame.length;point++) {
			
			VedioGame data= vedioGame[point];
			data.display();
		 }
		
		
		}

}
