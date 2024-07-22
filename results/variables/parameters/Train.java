class Train{
	public static void book(String source,String destination){
		System.out.println("running book with two string parameter in Train");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		
	}
	
	public static void book(String source,String destination,int quantity){
		System.out.println("running book with 3 string parameter in Train");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		
	}
	
	public static void book(String source,String destination,int quantity,double prize){
		System.out.println("running book with 4 string parameter in Train");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("prize:"+prize);
		
	}
	
	public static void cancel(long ticketNo){
		System.out.println("running cancel with string parameter in Train");
		System.out.println("ticket no:"+ticketNo);
	}
	
	public static void cancel(String source,String destination){
		System.out.println("running cancel with two string parameter in Train");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	
	
}