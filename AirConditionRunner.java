class AirConditionRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		AirCondition airCondition=new AirCondition();
		double cost=airCondition.cost;
		String name=airCondition.name;
		int code=airCondition.code;
		System.out.println("cost:"+cost);
		System.out.println("name:"+name);
		System.out.println("code:"+code);
		
		
		
		System.out.println("end of main");
	}
}