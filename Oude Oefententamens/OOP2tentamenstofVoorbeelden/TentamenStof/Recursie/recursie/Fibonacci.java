package recursie;

public class Fibonacci {

	public static long head(int i) {
		// terugtellen van i naar 0
		if( i == 0 || i == 1) return i; // base case kan ook anders geformuleerd worden if( i <= 2) return 1
		return head(i - 1) + head(i - 2); 
	}

	public static long tail(int n) {
		return tailHelper(0, 1, n); // oude base case wordt initiele waarde 0 en 1 
	}

	private static long tailHelper(int a, int b, int index) { // accumulutor houdt het aantal stappen bij
		if( index == 1) return b; // nieuwe base case wordt teruggave accumulator
		return tailHelper(b, a + b , index - 1); // b wordt nieuwe eerst getal, volgende wordt de som van de twee eerdere
	}

}
