class StadiumRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Stadium stadium=new Stadium();
		String name=stadium.name;
		int seats=stadium.seats;
		double cost=stadium.cost;
		System.out.println("name:"+name);
		System.out.println("seats:"+seats);
		System.out.println("cost:"+cost);
		stadium.name="Chinnaswamy";
		stadium.seats=2567;
		System.out.println("updated name:"+stadium.name);
		System.out.println("updated seats:"+stadium.seats);
		System.out.println("end of main");
	}
}