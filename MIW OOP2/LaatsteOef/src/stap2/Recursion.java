package stap2;

public class Recursion {

	public Recursion() {
		super();
	}

	public static void main(String[] args) {
		Recursion rec = new Recursion();
		rec.recursionTest();
	}

	public void recursionTest() {
		String s = "abcde";
		System.out.println("s is: " + s);
		System.out.println("Invert(s) is: " + invert(s));

		System.out.println(s + " is " + (isPalinDroom(s) ? "wel een" : "geen") + " palindroom");

		s = "meetsysteem";
		System.out.println(s + " is " + (isPalinDroom(s) ? "wel een" : "geen") + " palindroom");
	}

	public String invert(String s) {
		
		if ((null == s) || (s.length() <= 1)) {
			return s;
		}
		return invert(s.substring(1)) + s.charAt(0);
	}
	// StringSplitter e = new StringSplitter();
	// e.first(s);
	// e.last(s);

	public boolean isPalinDroom(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (s.length() % 2 != 0) {
			sb.deleteCharAt(s.length() / 2);
			s = sb.toString();
		}
		
		String first = StringSplitter.first(s);
		String last = StringSplitter.last(s);
		last = invert(last);
		System.out.println(first + last);
		if (first.equalsIgnoreCase(last)) {
			return true;
		}
		{
			return false;

		}

	}
}
