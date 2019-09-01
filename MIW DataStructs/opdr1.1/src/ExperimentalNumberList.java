import java.util.Arrays;

public class ExperimentalNumberList {

	private int[] numberList;
	private int numberOfElements;
	private int maximumValue;
	private int minimumValue;

	public ExperimentalNumberList(int numberOfElements) {

		this.numberList = new int[numberOfElements];
		this.numberOfElements = numberOfElements;
		

	}
	
	public int countPositives() {
		int pos=0;
		for (int i = 0; i < numberOfElements; i++) {
			if(numberList[i]>=0) {
				pos++;
			}
		}
		return pos;
	}

	public void generateNumbers(int min, int max) {
		this.maximumValue = max;
		this.minimumValue = min;
		for (int i = 0; i < numberOfElements; i++) {
			this.numberList[i] = (int) (min +Math.random() * (maximumValue - minimumValue+1));
		}

	}

	public boolean equalValuesExist() {
		for (int i = 0; i < numberOfElements; i++) {
			for (int j = 0; j < numberOfElements; j++) {
				if (i != j && numberList[i] == numberList[j]) {

					return true;
				}

			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "ExperimentalNumberList [numberList=" + Arrays.toString(numberList) + "]";
	}

}
