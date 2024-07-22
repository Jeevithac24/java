class MedicineRunner{
	public static void main(String[] medicine){
		System.out.println("starting main");
		Medicine.price("cipla");
		Medicine.price("paracetamol");
		Medicine.price("dollo");
		Medicine.price("seesa");
		Medicine.medicineName("cough,cold");
		Medicine.medicineName("headache");
		Medicine.medicineName("fever");
		Medicine.medicineName("stomach pain");
		Medicine.availability("Dr. Harshitha");
		Medicine.availability("Dr. Jayashree");
		Medicine.availability("Dr Laksh");
		Medicine.availability("Dr. Ram");
		}
}