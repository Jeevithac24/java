class PlaceRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		Place place=new Place();
		String name=place.name;
		double distance=place.distance;
		int area=place.area;
		System.out.println("name:"+name);
		System.out.println("distance:"+distance);
		System.out.println("area:"+area);
		place.name="Bnagalore";
		place.distance=60;
		place.area=32899;
		System.out.println("name:"+place.name);
		System.out.println("cost:"+place.distance);
		System.out.println("quantity:"+place.area);
		
		System.out.println("end of main");
	}
}