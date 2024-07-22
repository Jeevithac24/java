class DesignRunner{
	
	public static void main(String[] args){
		int count=10;
		//for(int i=0;i<=count;i++){
			//for(int j=i;j<count;j++){
				//System.out.print(" ");
			//}
			
			//for(int k=0;k<=i;k++){
			//System.out.print(" *");
			//}
			
		//System.out.println();
		//}
		for(int i=0;i<count;i++){
			for(int j=0;j<=i;j++){
				
				System.out.print(" ");
			}
			for(int k=i;k<count;k++){
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}
}