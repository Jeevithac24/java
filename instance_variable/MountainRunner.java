class MountainRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Mountain mountain=new Mountain();
		String name=mountain.name;
		String location=mountain.location;
		double height=mountain.height;
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("height:"+height);
		mountain.name="Savandurga";
		mountain.height=1226;
		System.out.println("updated name:"+mountain.name);
		System.out.println("updated height:"+mountain.height);
		System.out.println("end of main");
	}
}