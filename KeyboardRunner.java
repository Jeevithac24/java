class KeyboardRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Keyboard keyboard=new Keyboard();
		String brand=keyboard.brand;
		String no_keys=keyboard.no_keys;
		double prize=keyboard.prize;
		System.out.println("name:"+name);
		System.out.println("no of keys:"+no_keys);
		System.out.println("prize:"+prize);
		keyboard.brand="dell";
		keyboard.prize=999.99;
		System.out.println("updated brand:"+keyboard.brand);
		System.out.println("updated prize:"+keyboard.prize);
		System.out.println("end of main");
	}
}