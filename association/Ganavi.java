class Ganavi{
	
	String email;
	Clip clip;
	
	public Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
	}
	
	public void print(){
		
		System.out.println("Ganavi email :"+email);
		clip.details();
	}
}