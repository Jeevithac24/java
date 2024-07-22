class Sheet{
	public static String country(int code){
		System.out.println("running country in Sheet");
		if(code==91){
			return "India";
		}
		if(code==92){
			return"Pakistan";
		}
		if(code==1){
			return "USA";
		}
		if(code==44){
			return"UK";
		}
		if(code==61){
			return"Australia";
		}
		return"country not found";
	}
	
	
	
	public static double price(String item){
		
		System.out.println("started price in Sheet");
		if(item=="dishWasher"){
			System.out.println("item:"+item);
			double price=56;
			System.out.println("price of "+item +price);
			return price;
		}
		if(item=="ladoo"){
			double price=25;
			System.out.println("price of "+item +price);
			return price;
		}
		if(item=="shoe"){
			double price=750;
			System.out.println("price of "+item +price);
			return price;
		}
		if(item=="cloth"){
			double price=1000;
			System.out.println("price of "+item +price);
			return price;
		}
		if(item=="scissor"){
			double price=58;
			System.out.println("price of "+item +price);
			return price;
		}
		System.out.println("the price is 0");
		return 0;
		
	}
	
	
	
	public static String producerName(String movieName){
		System.out.println("started producerName in Sheet");
		if(movieName=="777Charlie"){
			String producer="Rakshith shetty";
			System.out.println("producer of movie "+movieName  +producer);
			return producer;
		}
	
		if(movieName=="Kalki"){
			String producer="Priyanka Dutt";
			System.out.println("producer of movie "+movieName  +producer);
			return producer;
		}
		if(movieName=="Kotee"){
			String producer="Jyoti Deshpande";
			System.out.println("producer of movie "+movieName  +producer);
			return producer;
		}
	
		if(movieName=="Kantara"){
			String producer="Rishab Shetty";
			System.out.println("producer of movie "+movieName  +producer);
			return producer;
		}
		if(movieName=="Raajakumara"){
			String producer="Vijay Kiragunur";
			System.out.println("producer of movie "+movieName  +producer);
			return producer;
		}
		System.out.println("producer of movie not found");
		return "not found";
	
		
	}
	
	
}