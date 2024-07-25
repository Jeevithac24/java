class MedicineRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Medicine medicine=new Medicine();
		String name=medicine.name;
		double cost=medicine.cost;
		double dosage=medicine.dosage;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("dosage:"+dosage);
		medicine.name="Cipla";
		medicine.cost=10;
		medicine.dosage=1;
		System.out.println("name:"+medicine.name);
		System.out.println("cost:"+medicine.cost);
		System.out.println("dosage:"+medicine.dosage);
		
		System.out.println("end of main");
	}
}