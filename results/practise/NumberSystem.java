class NumberSystem{
	public static void number(int[] num){
		for(int no=0;no<num.length;no++){
			if(num[no]%3==0){
				System.out.println("number divisible by 3:"+num[no]);
				
			}
		}
		
	}
	
	
	public static boolean mail(String[] email){
		for(int id=0;id<email.length;id++){
			if(email[id]=="jeevitha@gamil.com"){
				boolean result=true;
				System.out.println("email found:"+result);
				return result;
			}
		}
		return false;
	}
}