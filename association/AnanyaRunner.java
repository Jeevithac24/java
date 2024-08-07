class AnanyaRunner{
	
	public static void main(String[] args){
		
		Knife knife=new Knife(20,2.1);
		Ananya ananya=new Ananya(9900027821l,knife);
		ananya.print();
		System.out.println("--------------------");
		Knife knife1=new Knife(30,2.5);
		Ananya ananya1=new Ananya(87670567800l,knife1);
		ananya1.print();
	}
}