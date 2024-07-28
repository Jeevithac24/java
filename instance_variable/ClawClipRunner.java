class ClawClipRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		ClawClip clawClip=new ClawClip();
		String name=clawClip.name;
		char size=clawClip.size;
		double price=clawClip.price;
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("size:"+size);
		clawClip.name="Zara";
		clawClip.size='M';
		System.out.println("updated name:"+clawClip.name);
		System.out.println("updated size:"+clawClip.size);
		System.out.println("end of main");
	}
}