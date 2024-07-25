class FruitRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Fruit fruit=new Fruit();
		String name=fruit.name;
		double cost=fruit.cost;
		int quantity=fruit.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		fruit.name="Apple";
		fruit.cost=100;
		fruit.quantity=5;
		System.out.println("name:"+fruit.name);
		System.out.println("cost:"+fruit.cost);
		System.out.println("quantity:"+fruit.quantity);
		
		System.out.println("end of main");
	}
}