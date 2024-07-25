class JuiceRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Juice juice=new Juice();
		String name=juice.name;
		double cost=juice.cost;
		int quantity=juice.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		juice.name="pineapple";
		juice.cost=30;
		juice.quantity=100;
		System.out.println("name:"+juice.name);
		System.out.println("cost:"+juice.cost);
		System.out.println("quantity:"+juice.quantity);
		
		System.out.println("end of main");
	}
}