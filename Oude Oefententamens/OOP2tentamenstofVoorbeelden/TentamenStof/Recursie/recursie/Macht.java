package recursie;

public class Macht {

	/** head recursion
	 * 
	 * @param gTal1
	 * @param exp1
	 * @return
	 */
	public static long head(int gTal1, int exp1) {
		if(exp1 == 0) {
			return 1;
		}
		return gTal1 * head(gTal1, exp1 - 1) ;
	}

	public static long tail(int gTal1, int exp1) {
		// oude base case wordt initiele waarde accumulator
		return tailhelper(gTal1, exp1, 1);
	}

	// hulp methode met accumulator
	private static long tailhelper(int gTal1, int exp1, int acc) {
		// nieuwe base case wordt laatste accumulator. 
		if(exp1 <= 0) { // 
			return acc; // 
		}
		
		return tailhelper(gTal1, exp1 - 1, acc * gTal1);  // accumulator verzamelt, kleinste eenheid is x * x, 
	}

}
