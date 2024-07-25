class FoodRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Food food=new Food();
		String name=food.name;
		double cost=food.cost;
		int quantity=food.quantity;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		food.name="Biryani";
		food.cost=160;
		food.quantity=5;
		System.out.println("name:"+food.name);
		System.out.println("cost:"+food.cost);
		System.out.println("quantity:"+food.quantity);
		
		System.out.println("end of main");
	}
}