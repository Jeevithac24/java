class Keybunch{
	String material;
	Key key;
	
	public Keybunch(String material,Key key){
		this.material=material;
		this.key=key;
		
	}
	
	public void print(){
		
		System.out.println("Keybunch material:"+this.material);
		key.display();
	}
}