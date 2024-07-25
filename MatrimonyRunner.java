class MatrimonyRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Matrimony matrimony=new Matrimony();
		String name=matrimony.name;
		double cost=matrimony.cost;
		String profile=matrimony.profile;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("profile:"+profile);
		matrimony.name="Shadhi.com";
		matrimony.cost=2000;
		matrimony.profile="Girl marriage";
		System.out.println("name:"+matrimony.name);
		System.out.println("cost:"+matrimony.cost);
		System.out.println("profile:"+matrimony.profile);
		
		System.out.println("end of main");
	}
}