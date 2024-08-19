package com.xworkz.factory.produt;

public class VedioGame {
	
	private int noOfPlayers;
	private String gamingCompany;
	private boolean win;
	
	
	public VedioGame() {
		System.out.println("constructor with no arguments");
	}
	
	public VedioGame(int noOfPlayers,String gamingCompany,boolean win) {
		
		this.noOfPlayers=noOfPlayers;
		this.gamingCompany=gamingCompany;
		this.win=win;
		System.out.println("created constructor with three parameters");
	}
	
	public void display() {
		System.out.println("no of players: "+noOfPlayers);
		System.out.println("gaming company: "+gamingCompany);
		System.out.println("game status win:"+win);
	}

}
