class RapidoRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Rapido rapido=new Rapido();
		String location=rapido.location;
		double cost=rapido.cost;
		double distance=rapido.distance;
		System.out.println("location of rapido:"+rapido);
		System.out.println("cost of ride:"+cost);
		System.out.println("distance:"+distance);
		
		
		
		System.out.println("end of main");
	}
}