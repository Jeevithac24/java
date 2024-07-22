class Company{
	public static void deliver(String item,String location){
		System.out.println("running deliver in Company");
		System.out.println("item:"+item);
		System.out.println("location:"+location);
	}
}

class DeliveryVehicle{
	public static void deliver(String item,String location){
		System.out.println("running deliver in DeliveryVehicle");
		Company.deliver(item,location);
	}
}

class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("running deliver in DeliveryVehicle");
		DeliveryVehicle.deliver(item,"Nelamangala");
		
	}
}

