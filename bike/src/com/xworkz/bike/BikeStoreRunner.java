package com.xworkz.bike;

import com.xworkz.bike.store.BikeStore;

public class BikeStoreRunner {

	public static void main(String[] args) {

		BikeStore bikeStore=new BikeStore();
		bikeStore.bikeInformation("honda");
		bikeStore.bikeInformation("fz");
		bikeStore.bikeInformation("r15");
		bikeStore.bikeInformation("bullet");
		bikeStore.bikeInformation("splender");
		bikeStore.bikeInformation("activa");
		bikeStore.bikeInformation("pleasure");
		bikeStore.display();
	}

}
