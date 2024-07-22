class BuyRunner{
	public static void main(String[] enterData){
		System.out.println("running main in BuyRunner");
		Buy.product("MAC",3500.687);
		Buy.product("Puma",-3500.687);
		Buy.product("Toordal",250,"premium",5000.45);
		Buy.product("Moongdal",0,"fine",9999999.98);
		Buy.product("Dettol",-90,"super",6098.98);
		Buy.product("Cinema ticket",20,"first class",-232323.23);
		Buy.bookMovieTicket("Kotte","Navarang theater",100,990.99);
		Buy.bookMovieTicket("Kotte","Navarang theater",0,990.99);
		Buy.bookMovieTicket("Kotte","Navarang theater",890,-990.99);
		Buy.buyEgg(200,8.687);
		Buy.buyEgg(-200,8.687);
		Buy.buyEgg(100,20.687);
		Buy.buyShampoo(500,200.6,"Love Nature","03/07/2024");
		Buy.buyShampoo(30,500.54,"Nyle","19/06/2024");
        Buy.buyShampoo(900,900.99,"Dove","20/05/2024");
		Buy.buyCake('M',"Pinata","Chocolate",800.5,200);
		Buy.buyCake('S',"Pinata","Chocolate",00.5,200);
		Buy.buyCake('M',"Pinata","Chocolate",800.5,-200);
		Buy.buyLaptop("HP",13,20000,2500,13.24,"windows 7",2,6);
		Buy.buyLaptop("Lenovo",9,-20000,5000,18.56,"wiindows 10",-2,15);
		Buy.buySmartWatch("Firebolt",3000.99,5,'F',3);
		Buy.buySmartWatch("Firebolt",9000.78,2,'A',1);
		Buy.buySmartWatch("Firebolt",2000.99,9,'N',5);

		
	}
}