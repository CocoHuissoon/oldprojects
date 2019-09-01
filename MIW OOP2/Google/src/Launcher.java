
public class Launcher {
	public static int pow(int a, int b) throws RekenfoutException {
		if (a <= 0 || b <= 0) {
			throw new RekenfoutException("Beide getallen moeten boven de 0 zijn");
		} else {
			int pow = a;
			for (int i = 1; i < b; i++) {
				pow *= a;
			}
			return pow;

		}
	}

	public static void main(String[] args) throws RekenfoutException, ClassNotFoundException {
		 GoogleDB google= new GoogleDB();
		 google.getDay();
		System.out.println(pow(1, 1));

	}

}
