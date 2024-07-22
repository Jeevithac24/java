class Country{
	public static void countryName(String[] states){
		System.out.println("started countryName in Country");
		for(int statesNo=0;statesNo<states.length;statesNo++){
			String store=states[statesNo];
			System.out.println("states in country are "+store);
		}
		System.out.println("started countryName in Country backward");
		for(int statesNo=states.length-1;statesNo>=0;statesNo--){
			String store=states[statesNo];
			System.out.println("states in country are "+store);
		}
	}
	
	
	
	
	public static void pincodeData(int[] pincode){
		System.out.println("started pincodeData in Country");
		for(int pincodeNo=0;pincodeNo<pincode.length;pincodeNo++){
			int store=pincode[pincodeNo];
			System.out.println("pincodes in country are "+store);
		}
		System.out.println("started pincodeData in Country backward");
		for(int pincodeNo=pincode.length-1;pincodeNo>=0;pincodeNo--){
			int store=pincode[pincodeNo];
			System.out.println("pincodes in country are "+store);
		}
	}
	
	
	
	public static void primeMinisterNames(String[] primeMinister){
		System.out.println("started primeMinisterNames in Country");
		for(int primeMinisterNo=0;primeMinisterNo<primeMinister.length;primeMinisterNo++){
			String store=primeMinister[primeMinisterNo];
			System.out.println("primeMinister in  Indian country is "+store);
		}
		System.out.println("started primeMinisterNames in Country backward");
		for(int primeMinisterNo=primeMinister.length-1;primeMinisterNo>=0;primeMinisterNo--){
			String store=primeMinister[primeMinisterNo];
			System.out.println("primeMinister in  Indian country is "+store);
		}
	}
	
	
	
	public static void cabinetMinisterNames(String[] cabinetMinister){
		System.out.println("started cabinetMinisterNames in Country");
		for(int cabinetMinisterNo=0;cabinetMinisterNo<cabinetMinister.length;cabinetMinisterNo++){
			String store=cabinetMinister[cabinetMinisterNo];
			System.out.println("cabinetMinister in  Indian country is "+store);
		}
		System.out.println("started cabinetMinisterNames in Country backward");
		for(int cabinetMinisterNo=cabinetMinister.length-1;cabinetMinisterNo>=0;cabinetMinisterNo--){
			String store=cabinetMinister[cabinetMinisterNo];
			System.out.println("cabinetMinister in  Indian country is "+store);
		}
	}
	
	
	
	public static void politicalPartyNames(String[] politicalParties){
		System.out.println("started politicalPartiesNames in Country");
		for(int politicalPartiesNo=0;politicalPartiesNo<politicalParties.length;politicalPartiesNo++){
			String store=politicalParties[politicalPartiesNo];
			System.out.println("politicalParties in  Indian country is "+store);
		}
		System.out.println("started politicalPartiesNames in Country backward");
		for(int politicalPartiesNo=politicalParties.length-1;politicalPartiesNo>=0;politicalPartiesNo--){
			String store=politicalParties[politicalPartiesNo];
			System.out.println("politicalParties in  Indian country is "+store);
		}
	}
}