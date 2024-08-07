class Ananya{
	
	long mobileNo;
	Knife knife;
	
	public Ananya(long mobileNo,Knife knife){
		
		this.mobileNo=mobileNo;
		this.knife=knife;
	}
	
	public void print(){
		
		System.out.println("Ananya mobile number:"+this.mobileNo);
		knife.print();
	}
}