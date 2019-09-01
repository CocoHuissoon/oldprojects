package recursie;

public class ArrayGemiddelde {

	public static double gemiddeldeHead(int[] array1) {
		return gemiddeldeHead(array1, 0) / array1.length;
	}

	private static double gemiddeldeHead(int[] array1, int i) {
		if(i >= array1.length - 1 ) {
			return array1[i];
		}
		return array1[i++] + gemiddeldeHead(array1, i);
	}

	public static double gemiddeldeTail(int[] array1) {
		return gemiddeldeTail(array1, 0, 0) / array1.length;
	}

	private static double gemiddeldeTail(int[] array1, int acc, int i) {
		if(i > array1.length - 1 ) {
			return acc;
		}
		return gemiddeldeTail(array1, (acc + array1[i++]), i); // berekening met accumulator meegeven
	}

}
