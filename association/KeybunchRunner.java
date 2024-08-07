class KeybunchRunner{
	
	public static void main(String[] args){
		
		Key key=new Key(6,"kale");
		Keybunch keybunch=new Keybunch("Plastic",key);
		keybunch.print();
		System.out.println("-------------------");
		
		Key key1=new Key(5,"Keycollections");
		Keybunch keybunch1=new Keybunch("rubber",key1);
		keybunch1.print();
	}
	
}