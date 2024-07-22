class Library{
	public static void borrow(String bookName){
		System.out.println("running borrow in library");
		System.out.println("bookName:"+bookName);
		
	}
	
	public static void buy(String bookName,String author,String edition,double prize){
		System.out.println("running buy in library");
		System.out.println("bookName:"+bookName);
		System.out.println("author:"+author);
		System.out.println("edition:"+edition);
		System.out.println("prize:"+prize);
		
	}
	
	public static void bookDetails(String bookName,String author,String publisherAddress,String edition,int bookNo,int noOfPage,int yearOfPublish,int quantity,double prize,boolean publish){
		System.out.println("running bookDetails in library");
		System.out.println("bookName:"+bookName);
		System.out.println("author:"+author);
		System.out.println("publisher address:"+publisherAddress);
		System.out.println("edition:"+edition);
		System.out.println("book No:"+bookNo);
		System.out.println("number Of Page :"+noOfPage);
		System.out.println("year Of Publish:"+yearOfPublish);
		System.out.println("quantity :"+quantity);
		System.out.println("prize:"+prize);
		System.out.println("publish:"+publish);
		
	}
	
	public static void collections(int noOfBooks,String subject){
		System.out.println("running collections in library");
		System.out.println("noOfBooks:"+noOfBooks);
		System.out.println("subject:"+subject);
		
	}
	
	public static void returning(String bookName,String author,boolean returnStatus){
		System.out.println("running collections in library");
		System.out.println("book Name:"+bookName);
		System.out.println("author:"+author);
		System.out.println("returnStatus:"+returnStatus);
		
	}
	
}