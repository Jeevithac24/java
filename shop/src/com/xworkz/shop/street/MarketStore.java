package com.xworkz.shop.street;

public class MarketStore {
	
	private MarketData[] datas=new MarketData[5];
	private int index;
	
	public void store(MarketData datas) {
		
		this.datas[this.index]=datas;
		this.index++;
		
	}
	
	public void show() {
		for(MarketData data:datas) {
			if(data!=null) {
				data.print();
			}
			else {
				System.out.println("data is null");
			}
		}
	}

}
