class CrowRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Crow crow=new Crow();
		String color=crow.color;
		int quantity=crow.quantity;
		double flying_height=crow.flying_height;
		System.out.println("color:"+color);
		System.out.println("quantity:"+quantity);
		System.out.println("flying_height:"+flying_height);
		crow.quantity=20;
		crow.flying_height=18.67;
		System.out.println("updated quantity:"+crow.quantity);
		System.out.println("updated flying_height:"+crow.flying_height);
		System.out.println("end of main");
	}
}