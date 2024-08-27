package com.xworkz.inheritance;

import com.xworkz.inheritance.store.SmartPhone;
import com.xworkz.inheritance.store.TouchScreenPhone;

public class TouchScreenPhoneRunner {

	public static void main(String[] args) {

		TouchScreenPhone touchScreenPhone=new TouchScreenPhone();
		touchScreenPhone.brand="samsung";
		touchScreenPhone.storage=256;
		touchScreenPhone.ai=false;
		touchScreenPhone.price=12000;
		touchScreenPhone.version="s20";
		touchScreenPhone.brandDetails();
		touchScreenPhone.storageDetails();
		SmartPhone smartPhone=new TouchScreenPhone();
		smartPhone.brand="vivo";
		smartPhone.storage=1000;
		smartPhone.ai=true;
		smartPhone.price=72000;
		smartPhone.version="v30";
		smartPhone.brandDetails();
		smartPhone.storageDetails();
		
		
	}

}
