class Key{
	
	double weight;
	String brand;
	
	public Key(double weight,String brand){
		
		this.weight=weight;
		this.brand=brand;
	}
	
	public void display(){
		
		System.out.println("key weight:"+this.weight);
		System.out.println("key brand:"+this.brand);
	}
	
}