class FoodDeliveryRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		FoodDelivery foodDelivery=new FoodDelivery();
		String item=foodDelivery.item;
		double cost=foodDelivery.cost;
		int quantity=foodDelivery.quantity;
		System.out.println("item:"+item);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		System.out.println("end of main");
	}
}