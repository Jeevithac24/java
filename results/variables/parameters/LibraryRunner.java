class LibraryRunner{
	public static void main(String[] args){
		System.out.println("running main in LibraryRunner");
		Library.borrow("Mahabharatha");		
		Library.buy("Thunder of life","Harry Poter","1st",499.99);
		Library.bookDetails("Number oF Kisses","Hary Poter","123 England","6th",1040,354,1934,150,5600.78,true);
        Library.collections(768,"History");		
		Library.returning("Thunder of books","Sudhamurthy",true);	
	}		



}