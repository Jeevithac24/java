class ChargerRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Charger charger=new Charger();
		String name=charger.name;
		double price=charger.price;
		int capacity=charger.capacity;
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("capacity:"+capacity);
		charger.name="oppo";
		charger.price=150;
		System.out.println("updated name:"+charger.name);
		System.out.println("updated price:"+charger.price);
		System.out.println("end of main");
	}
}