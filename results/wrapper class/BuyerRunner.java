class BuyerRunner{
	
	public static void main(String[] data){
		System.out.println("started main in BuyerRunner");
		if(data.length==8){
			String name=data[0];
			String manufDate=data[1];
			String price=data[2];
			String quantity=data[3];
			double covretedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Buyer.medicine(name,manufDate,covretedPrice,convertedQuantity);
		}
		else{
			System.out.println("data required");
		}
				
		if(data.length==8){
			String name1=data[4];
			String brand1=data[5];
			String price1=data[6];
			String quantity1=data[7];
			double covretedPrice1=Double.parseDouble(price1);
			int convertedQuantity1=Integer.parseInt(quantity1);
			Buyer.juice(name1,brand1,covretedPrice1,convertedQuantity1);
		}
		else{
			System.out.println("data required");
		}
		
	}
}