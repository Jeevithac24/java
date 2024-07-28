class ClockRunner{
	
	public static void main(String[] args){
		
		System.out.println("started main");
		Clock clock=new Clock();
		String time=clock.time;
		int hands=clock.no_hands;
		double prize=clock.prize;
		System.out.println("time:"+time);
		System.out.println("no of hands:"+hands);
		System.out.println("prize:"+prize);
		clock.time="3hr 56min 5sec";
		clock.prize=150;
		System.out.println("updated time:"+clock.time);
		System.out.println("updated prize:"+clock.prize);
		System.out.println("end of main");
	}
}