package com.xworkz.shop;

import com.xworkz.shop.street.MarketData;
import com.xworkz.shop.street.MarketStore;

public class MarketRunner {
	
	public static void main(String args[]) {
		
		MarketStore marketStore=new MarketStore();
		marketStore.show();
		MarketData data1=new MarketData("sunday market", "bangalore");
		data1.print();
		MarketData data2=new MarketData("kr market","bangalore");
		data2.print();
		MarketData data3=new MarketData("bangalore market", "bangalore");
		data3.print();
		MarketData data4=new MarketData("mysore market","mysore");
		data4.print();
		MarketData data5=new MarketData("mangalore market", "mangalore");
		data5.print();
	}

}
