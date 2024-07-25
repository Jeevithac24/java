class AlcoholRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Alcohol alcohol=new Alcohol();
		String name=alcohol.name;
		double cost=alcohol.cost;
		int quantity=alcohol.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		alcohol.name="Black&White";
		alcohol.cost=2000;
		alcohol.quantity=500;
		System.out.println("name:"+alcohol.name);
		System.out.println("cost:"+alcohol.cost);
		System.out.println("quantity:"+alcohol.quantity);
		
		System.out.println("end of main");
	}
}