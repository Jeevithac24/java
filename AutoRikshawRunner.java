class AutoRikshawRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		AutoRikshaw autoRikshaw=new AutoRikshaw();
		int model=autoRikshaw.model;
		String brand=autoRikshaw.brand;
		double cost=autoRikshaw.cost;
		System.out.println("model:"+model);
		System.out.println("brand:"+brand);
		System.out.println("cost:"+cost);
		
		
		
		System.out.println("end of main");
	}
}