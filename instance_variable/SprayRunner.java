class SprayRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Spray spray=new Spray();
		String purpose=spray.purpose;
		String name=spray.name;
		double cost=spray.cost;
		System.out.println("purpose:"+purpose);
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		spray.name="Lyon";
		spray.cost=299;
		System.out.println("updated name:"+spray.name);
		System.out.println("updated cost:"+spray.cost);
		System.out.println("end of main");
	}
}