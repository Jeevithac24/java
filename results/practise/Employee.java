class Employee{
	
	public static double salaryDetails(int age){
		System.out.println("updating salary in employee");
		double salary=15000;
		double increment=salary+2000;
		double doubleIncrement=increment+2000;
		if(age>=18&&age<=25){
			return salary;
		}
		else if(age>25&&age<=30){
			
			return increment;
		}
		else{
			
			return doubleIncrement;
			
			
		}
		
	}
}