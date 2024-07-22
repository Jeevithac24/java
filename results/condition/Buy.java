class Buy{
	public static void product(String brand,double price){
		System.out.println("running product with two parameters in Buy");
		if(price>100.50&&price<5500.453){
			System.out.println("valid price");
			System.out.println("price:"+price);
		}
		else{
			System.out.println("price:"+price +"invalid");
		}
	}
	
	
	public static void product(String name,int quantity,String quality,double price){
		System.out.println("running product with 4 parameters in Buy");
		if(quantity>0&&quantity<1000){
			System.out.println("valid quantity");
			System.out.println("quantity:"+quantity);
		}
		else{
			System.out.println("quantity:"+quantity +"invalid");
		}
		if(price>100.50&&price<100000.999){
			System.out.println("valid price");
			System.out.println("price:"+price);
		}
		else{
			System.out.println("price:"+price +"invalid");
		}
	}
	
	
	public static void bookMovieTicket(String name,String theatername,int quantity,double price){
		System.out.println("running bookMovieTicket with 4 parameters in Buy");
		if(quantity>0&&quantity<1000){
			System.out.println("valid quantity");
			System.out.println("quantity:"+quantity);
		}
		else{
			System.out.println("quantity:"+quantity +"invalid");
		}
		if(price>250.50&&price<1000.999){
			System.out.println("valid price");
			System.out.println("price:"+price);
		}
		else{
			System.out.println("price:"+price +"invalid");
		}
	}
	
	public static void buyEgg(int total,double pricePerEgg){
		System.out.println("running buyEgg with 2 parameters in Buy");
		if(total>0&&total<=200){
			System.out.println("valid total");
			System.out.println("total:"+total);
		}
		else{
			System.out.println("total:"+total +"invalid");
		}
		if(pricePerEgg>7.50&&pricePerEgg<10.5){
			System.out.println("valid price per egg");
			System.out.println("pricePerEgg:"+pricePerEgg);
		}
		else{
			System.out.println("pricePerEgg:"+pricePerEgg +"invalid");
		}
	}
	
	public static void buyShampoo(int quantityInML,double price,String brand,String manfDate){
		System.out.println("running buyShampoo with 4 parameters in Buy");
		if(quantityInML>50&&quantityInML<1000){
			System.out.println("valid quantityInML");
			System.out.println("quantity in ml:"+quantityInML);
		}
		else{
			System.out.println("quantity in ml:"+quantityInML +"invalid");
		}
		if(price>60.50&&price<700.69){
			System.out.println("valid price ");
			System.out.println("price:"+price);
		}
		else{
			System.out.println("price:"+price +"invalid");
		}
	}
	
	public static void buyCake(char size,String type,String flavor,double cost,int quantity){
		System.out.println("running buyCake with 5 parameters in Buy");
		if(cost>100.50&&cost<100000.999){
			System.out.println("valid cost");
			System.out.println("cost:"+cost);
		}
		else{
			System.out.println("cost:"+cost +"invalid");
		}
		if(quantity>0&&quantity<1000){
			System.out.println("valid quantity");
			System.out.println("quantity:"+quantity);
		}
		else{
			System.out.println("quantity:"+quantity +"invalid");
		}
		
	}
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int hardDiskSize,int ramSize){
		System.out.println("running buyLaptop with 8 parameters in Buy");
		if(serialNo>0&&serialNo<200){
			System.out.println("valid serialNo");
			System.out.println("serialNo:"+serialNo);
		}
		else{
			System.out.println("serialNo:"+serialNo +"invalid");
		}
		if(price>10000.50&&price<500000.999){
			System.out.println("valid price");
			System.out.println("price:"+price);
		}
		else{
			System.out.println("price:"+price +"invalid");
		}
		if(batteryCapacity>2000&&batteryCapacity<3000){
			System.out.println("valid batteryCapacity");
			System.out.println("batteryCapacity:"+batteryCapacity);
		}
		else{
			System.out.println("batteryCapacity:"+batteryCapacity +"batteryCapacity");
		}
		if(screenSize>11.9&&screenSize<16.78){
			System.out.println("valid screenSize");
			System.out.println("screenSize:"+screenSize);
		}
		else{
			System.out.println("screenSize:"+screenSize +"invalid");
		}
		if(hardDiskSize>2.5&&hardDiskSize<3.5){
			System.out.println("valid hardDiskSize");
			System.out.println("hardDiskSize:"+hardDiskSize);
		}
		else{
			System.out.println("hardDiskSize:"+hardDiskSize +"hardDiskSize");
		}
		if(ramSize>4&&ramSize<12){
			System.out.println("valid ramSize");
			System.out.println("ramSize:"+ramSize);
		}
		else{
			System.out.println("ramSize:"+ramSize +"invalid");
		}
	}
	
	
	public static void buySmartWatch(String brand,double price,int color,char type,int mode){
		System.out.println("running buySmartWatch with 5 parameters in Buy");
		
		if(price>1000.99&&price<50000.999){
			System.out.println("valid price");
			System.out.println("price:"+price);
		}
		else{
			System.out.println("price:"+price +"invalid");
		}
		if(color==1){
			System.out.println("valid color");
			System.out.println("color:red");
		}
		if(color==2){
			System.out.println("valid color");
			System.out.println("color:green");
		}
		if(color==3){
			System.out.println("valid color");
			System.out.println("color:blue");
		}
		if(color==4){
			System.out.println("valid color");
			System.out.println("color:yellow");
		}
		if(color==5){
			System.out.println("valid color");
			System.out.println("color:black");
		}
		if(color==6){
			System.out.println("valid color");
			System.out.println("color:white");
		}
		if(color==7){
			System.out.println("valid color");
			System.out.println("color:orange");
		}
		else{
			System.out.println("color:"+color +"invalid");
		}
		if(mode==1){
			System.out.println("valid mode");
			System.out.println("mode:silent mode");
		}
		if(mode==2){
			System.out.println("valid mode");
			System.out.println("mode:theater mode");
		}
		if(mode==3){
			System.out.println("valid mode");
			System.out.println("mode:bedtime mode");
		}
		if(color==4){
			System.out.println("valid mode");
			System.out.println("mode:sports mode");
		}
		else{
			System.out.println("mode:"+mode +"invalid");
		}
	}
	
}