package stap2;

public class Recursion {

	public Recursion() {
		super();
	}

	public static void main(String[] args) {
		Recursion rec = new Recursion();
		rec.recursionTest();
	}

	private void recursionTest() {
		String s = "abcde";
		System.out.println("s is: " + s);
		System.out.println("Invert(s) is: " + invert(s));

		System.out.println(s + " is " + (isPalinDroom(s) ? "wel een" : "geen") + " palindroom");

		s = "meetsysteem";
		System.out.println(s + " is " + (isPalinDroom(s) ? "wel een" : "geen") + " palindroom");
	}

	public String invert(String s) {

		while (s.length() > 0) {
			if (s.length() == 1) {
				return s;
			} else {
				return invert(StringSplitter.last(s)) + invert(StringSplitter.first(s)); // StringSplitter hoef je niet
																							// te initialiseren omdat
																							// diteen static methode is
			}
		}
		return s;
	}

	public boolean isPalinDroom(String s) {
		String before = s;
		String after = invert(s);

		if (before.equals(after)) {
			return true;
		} else {
			return false;
		}
	}

}
