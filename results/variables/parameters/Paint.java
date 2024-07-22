class Paint{
	public static void information(String brand){
		System.out.println("running a information in the paint");
		System.out.println("brand:"+brand);
	}
	
	public static void information(String brand,String color){
		System.out.println("running informationmation with two string in paint");
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
		
	}
	
	public static void details(String brand,double price){
		System.out.println("running details with  in paint");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		
	}
	
	public static void details(String color,String type,double price){
		System.out.println("running details with two string parameter in paint");
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
	

}