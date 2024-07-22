class BloodRunner{
	
	public static void main(String[] details){
		System.out.println("running main in BloodRunner");
		String type=Blood.group();
		System.out.println("blood group type :"+type);
		String detail=Blood.personName();
		System.out.println("donar name:"+detail);
		double store=Blood.cost();
		System.out.println("price to test the blood:"+store);
		String lab=Blood.hospitalTested();
		System.out.println("hospital name:"+lab);
		boolean health=Blood.sickness();
		System.out.println("whether the donar affected with sick: "+health);
		boolean action=Blood.donated();
		System.out.println("donar donated the blood:"+action);
	}
}