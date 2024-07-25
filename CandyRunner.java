class CandyRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Candy candy=new Candy();
		String name=candy.name;
		double cost=candy.cost;
		int quantity=candy.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		candy.name="Nestle";
		candy.cost=10;
		candy.quantity=50;
		System.out.println("name:"+candy.name);
		System.out.println("cost:"+candy.cost);
		System.out.println("quantity:"+candy.quantity);
		
		System.out.println("end of main");
	}
}