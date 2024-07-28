class LolipopRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Lolipop lolipop=new Lolipop();
		String name=lolipop.name;
		String flavor=lolipop.flavor;
		double prize=lolipop.prize;
		System.out.println("name:"+name);
		System.out.println("flavor:"+flavor);
		System.out.println("prize:"+prize);
		lolipop.name="Alpenliebe";
		lolipop.flavor="Strawberry";
		System.out.println("updated name:"+lolipop.name);
		System.out.println("updated flavor:"+lolipop.flavor);
		System.out.println("end of main");
	}
}