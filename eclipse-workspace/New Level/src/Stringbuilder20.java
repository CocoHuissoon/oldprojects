
public class Stringbuilder20 {
	public static void main (String[]args) {
		
		// This is inefficient.
		String info = "     ";
		info += "My name is Bob.";
		info += " ";
		info +="I am a builder";
		System.out.println(info);
		
		// More efficient.
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver");
		System.out.println(s.toString());
		
		// Formating.
		
		System.out.println("I like turtles. \t That's a new tab. \nThat's a new line");
		
		//Formating integers.
		
		System.out.printf("Total cost %10d; quantity is %d\n", 5, 11);
		
		for (int i=0; i<20; i++) {
			System.out.printf("%-6d:%s\n", i , "Here is some text" );
		}
		//Formating floating point values.
		System.out.printf("Total value: %.2f\n",5.6899);
		System.out.printf("Total value: %-5.2f\n",44433.55456);

	}
	
}
