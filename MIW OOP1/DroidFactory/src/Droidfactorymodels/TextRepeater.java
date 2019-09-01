package Droidfactorymodels;

public class TextRepeater extends TextCommunicationModule {

	private final static int DEFAULT_NUMBER_OF_REPETITIONS = 3;
	private int numberOfRepetitions;

	public TextRepeater(String communicationText) {
		super(communicationText);
		this.numberOfRepetitions=DEFAULT_NUMBER_OF_REPETITIONS;
	}

	public TextRepeater(String communicationText, int numberOfRepetitions) {
		super(communicationText);
		this.numberOfRepetitions = numberOfRepetitions;
	}

	
	public void work() {
		for (int i=0;i<this.numberOfRepetitions;i++) {
			System.out.println(super.toString());
		}
		
	}

}
