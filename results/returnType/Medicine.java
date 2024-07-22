class Medicine{
	public static double price(String medicineName){
		System.out.println("reading the price from medicine");
		if(medicineName=="cipla"){
			System.out.println("medicine name:"+medicineName);
			double price=35.78;
			System.out.println(" the price :"+price);
			return price;
		}
		else if(medicineName=="paracetamol"){
			System.out.println("medicine name:"+medicineName);
			double price=12.89;
			System.out.println("price of medicine is:" +price);
			return price;
		}
		else if(medicineName=="dollo"){
			System.out.println("medicine name:"+medicineName);
			double price=9.99;
			System.out.println("price of medicine is:" +price);
			return price;
		}
		System.out.println("medicine not found");
		return 0;
	}
	
	
	public static String medicineName(String symptom){
		System.out.println("reading the medicineName from medicine");
		if(symptom=="cough,cold"){
			System.out.println("symptom:"+symptom);
			String medicineName="cipla";
			System.out.println(" the medicineName :"+medicineName);
			return medicineName;
		}
		else if(symptom=="headache"){
			System.out.println("symptom :"+symptom);
			String medicineName="paracetamol";
			System.out.println(" medicine name:" +medicineName);
			return medicineName;
		}
		else if(symptom=="fever"){
			System.out.println("symptom :"+symptom);
			String medicineName="paracetamol";
			System.out.println("medicine name:" +medicineName);
			return medicineName;
		}
		System.out.println("medicine not found");
		return "no medicine";
	}
	
	
	public static String availability(String doctorName){
		System.out.println("reading the availability from medicine");
		if(doctorName=="Dr. Harshitha"){
			System.out.println("doctor name:"+doctorName);
			String availability="9.00 am-12.30pm";
			System.out.println(" availability :"+availability);
			return availability;
		}
		else if(doctorName=="Dr. Jayashree"){
			System.out.println("doctor name:"+doctorName);
			String availability="6.30 pm - 9.00 pm";
			System.out.println(" availability:" +availability);
			return availability;
		}
		else if(doctorName=="Dr Laksh"){
			System.out.println("doctor name:"+doctorName);
			String availability="1.00pm - 6.00 pm";
			System.out.println("availability:" +availability);
			return availability;
		}
		System.out.println(" not found");
		return "no availability";
	}
}