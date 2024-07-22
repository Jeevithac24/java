class TrainRunner{
	public static void main(String[] args){
		System.out.println("running main in TrainRunner");
		Train.book("Bangalore","Bijapur");		
		Train.book("Bangalore","Bijapur",60);
		Train.book("Bangalore","Bijapur",120,12000.50);
        Train.cancel(10234587L);		
		Train.cancel("Belagum","Mysore");	
	}		



}