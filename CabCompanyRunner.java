class CabCompanyRunner{
	
	
	public static void main(String[] args){
		
		System.out.println("start of main");
		CabCompany cabCompany=new CabCompany();
		String name=cabCompany.name;
		double cost=cabCompany.cost;
		int employee=cabCompany.employee;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("employee:"+employee);
		
		System.out.println("end of main");
	}
}