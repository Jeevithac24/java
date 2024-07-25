class ApplicationRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Application application=new Application();
		String name=application.name;
		double cost=application.cost;
		double storage=application.storage;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("storage:"+storage);
		application.name="Instagram";
		application.cost=100;
		application.storage=200;
		System.out.println("name:"+application.name);
		System.out.println("cost:"+application.cost);
		System.out.println("storage:"+application.storage);
		
		System.out.println("end of main");
	}
}