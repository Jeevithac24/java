class SheetRunner{
	public static void main(String[] args){
		System.out.println("started main in SheetRunner");
		String name=Sheet.country(91);
		System.out.println("the entered code is of country "+name);
		String name1=Sheet.country(92);
		System.out.println("the entered code is of country "+name1);
		String name2=Sheet.country(1);
		System.out.println("the entered code is of country "+name2);
		String name3=Sheet.country(44);
		System.out.println("the entered code is of country "+name3);
		String name4=Sheet.country(61);
		System.out.println("the entered code is of country "+name4);
		String name5=Sheet.country(56);
		System.out.println("the entered code is of country "+name5);
		Sheet.price("dishWasher");
		Sheet.price("ladoo");
		Sheet.price("shoe");
		Sheet.price("cloth");
		Sheet.price("scissor");
		Sheet.price("mat");
		Sheet.producerName("777Charlie");
		Sheet.producerName("Kalki");
		Sheet.producerName("Kotee");
		Sheet.producerName("Kantara");
		Sheet.producerName("Raajakumara");
		Sheet.producerName("Male");
	}
}