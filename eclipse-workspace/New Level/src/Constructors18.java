class Machine {
	private String name;
	private int code;
	

	public Machine() {
		this("Arnie", 3);
		System.out.println("Constructor running");

	}
	public Machine (String name) {
		this(name,0);
		System.out.println("Second constructor running!");
		this.name = name;
	}
	public Machine (String name, int Code) {
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class Constructors18 {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		new Machine();
		//Machine machine2 = new Machine ("Pooooop");
		//Machine machine3 = new Machine ("Mr Poopytbutthole" , 21);
		

	}
}