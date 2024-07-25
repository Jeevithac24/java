class AutoDriverRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		AutoDriver autoDriver=new AutoDriver();
		String name=autoDriver.name;
		char gender=autoDriver.gender;
		int experience=autoDriver.experience;
		System.out.println("name:"+name);
		System.out.println("gender:"+gender);
		System.out.println("experience:"+experience);
		
		
		
		System.out.println("end of main");
	}
}