class CountryRunner{
	public static void main(String[] args){
		System.out.println("started main in CountryRunner with states");
		String[] statesName={"Andrapradesh","Arunachal pradesh","Assam","Bihar","Chhattisgrah","Goa","Gujurat","Haryana","Himachal pradesh","Jharkhand","Karnataka","Kerala","Madhya pradesh","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamilnadu","Telangana","Tripura","Uttarpradesh","Uttarkhand","Westbengal"};
		Country.countryName(statesName);

		
		System.out.println("started main in CountryRunner with pincode");
		int[] pincodeList={56123,560001,530068,560002,560003,560083,560026,561222,560028,560117,560300};		
		Country.pincodeData(pincodeList);
		
		
        System.out.println("started main in CountryRunner with primeMinister");
		String[] primeMinisterList={"Jawaharlal Nehru","Lal Bahadur Shastri","Gulzari Lal Nanda","Morarji Desai","Charan Singh","Indira Gandhi","Rajiv Gandhi","Vishwanath Prathap Singh","Chandra Shekhar","Narasimha Rao","H.D.Deve Gowda","Inder Kumar Gujral","Atal Bihari Vajpayee","Manmohan Singh","Narendra Modi"};			
		Country.primeMinisterNames(primeMinisterList);
		
		
		
        System.out.println("started main in CountryRunner with politicalParties");
		String[] politicalPartiesList={"BJP","Congress","JDS","BSP","CPM"};		
		Country.politicalPartyNames(politicalPartiesList);			

		

	}
}