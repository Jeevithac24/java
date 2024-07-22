class Dog{
	public static void guarding(String location){
		System.out.println("running guarding in Dog");
		System.out.println("location:"+location);
	}
} 

class House{
	public static void watch(String location){
		System.out.println("running watch in House");
		Dog.guarding(location);
	}
}