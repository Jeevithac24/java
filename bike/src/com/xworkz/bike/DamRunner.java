package com.xworkz.bike;

import com.xworkz.bike.store.Dam;

public class DamRunner {

	public static void main(String[] args) {

		Dam dam=new Dam();
		dam.damDetails("sardar sarovar");
		dam.damDetails("tehri");
		dam.damDetails("bhakra nangal");
		dam.damDetails("hirakud");
		dam.damDetails("nagarjuna sagar");
		dam.damDetails("srisailam");
		dam.damDetails("dantiwada");
		dam.damDetails("indira sagar");
		dam.damDetails("koyna");
		dam.damDetails("idukki");
		dam.display();
	}

}
