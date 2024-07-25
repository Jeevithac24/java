class BMTCRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		BMTC bMTC=new BMTC();
		String destination=bMTC.destination;
		double cost=bMTC.cost;
		int quantity=bMTC.quantity;
		System.out.println("destintion:"+destination);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		
		System.out.println("end of main");
	}
}