class Lipstick{
	public static void matte(){
		System.out.println("running matte in Lipstick");
		liquidMatte();
	}
	public static void liquidMatte(){
		System.out.println("running liquidMatte in Lipstick");
		matte();
	}
}