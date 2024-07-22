class ChainRunner{
	
	public static void main(String[] args){
		System.out.println("Running main in ChainRunner");
		double value=Chain.carat();
		System.out.println("carat of gold iin chain:"+value);
		double cost=Chain.costPerGram();
		System.out.println("Cost of chain per gram:"+cost);
		String store=Chain.type();
		System.out.println("type of chain:"+store);
		String data=Chain.quality();
		System.out.println("quality of chain:"+data);
		double gram=Chain.quantityInGram();
		System.out.println("Running main in ChainRunner");
		double waste=Chain.wastage();
		System.out.println("wastage in chain:"+waste);
		double service=Chain.serviceCharge();
		System.out.println("service charge:"+service);
		double number=Chain.gst();
		System.out.println("gst cost:"+number);
	}
}