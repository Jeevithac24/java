class Minister{
	public static void serve(){
		System.out.println("Minister should serve the people");
		Assistant.help();
	}
}

class Assistant{
	public static void help(){
		System.out.println("Assistant gets the help from Minister");
		Driver.drive();
	}
}

class Driver{
	public static void drive(){
		System.out.println("Driver drives the vehicle");
		Vehicle.transport();
	}
}

class Vehicle{
	public static void transport(){
		System.out.println("Vehicle is used for transportation");
		MusicSystem.play();
	}
}

class MusicSystem{
	public static void play(){
		System.out.println("MusicSystem plays a song");
		Application.run();
	}
}

class Application{
	public static void run(){
		System.out.println("Code is used to run a application");
		Internet.stream();
	}
}

class Internet{
	public static void stream(){
		System.out.println("Internet streams in this era");
		Server.connect();
	}
}

class Server{
	public static void connect(){
		System.out.println("Server connects to website");
		Location.display();
	}
}

class Location{
	public static void display(){
		System.out.println("Location is displayed");
		Building.openGate();
	}
}

class Building{
	public static void openGate(){
		System.out.println("Building openGate");
		Metal.strength();
	}
}

class Metal{
	public static void strength(){
		System.out.println("Metal has good strength");
		Factory.make();
	}
}

class Factory{
	public static void make(){
		System.out.println("Factory makes product");
		Machine.design();
	}
}

class Machine{
	public static void design(){
		System.out.println("Machine creates a design");
		Engineer.nothing();
	}
}

class Engineer{
	public static void nothing(){
		System.out.println("nothing is impossible to Engineer");
	}
}