class JeanRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Jean jean=new Jean();
		String name=jean.name;
		String type=jean.type;
		double prize=jean.prize;
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		System.out.println("prize:"+prize);
		jean.type="Straight fit";
		jean.prize=799.99;
		System.out.println("updated type:"+jean.type);
		System.out.println("updated prize:"+jean.prize);
		System.out.println("end of main");
	}
}