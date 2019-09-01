class Thing {
	public final static int LUCKY_NUMBER = 8;
	public static int number = 4;
	public String name;
	public static String description;
	
	public static int count = 0;
	public int id;
	
		
	public Thing () {
		id = count;

		count++;
	}

	public void showName() {
		System.out.println("Object id is " + id +" " + description + " and my name is " + name);
	}

	public static void showInfo() {
		System.out.println(description);
		// Won't work: System.out.println(name);
	}

}

public class Static19 {
	public static void main(String[] args) {
		Thing.description = "I am a thing";
		
		System.out.println("Before creating objects count is:" + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creating objects count is:" + Thing.count);

		thing1.name = "Bobo";
		thing2.name = "Seuseu";
		// thing1.description = "funny";
		// thing2.description = "hilarious";
		System.out.println(thing2.description);
		System.out.println(thing1.name + " " + thing2.name);
		thing1.showName();
		thing2.showName();
		Thing.showInfo();
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println(Thing.LUCKY_NUMBER + Thing.number);
		

	}

}
