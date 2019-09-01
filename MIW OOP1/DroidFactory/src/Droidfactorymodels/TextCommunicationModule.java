package Droidfactorymodels;

public abstract class TextCommunicationModule implements Workable {
	private String communicationText;
	
	public TextCommunicationModule(String communicationText) {
		super();
		this.communicationText= "[Hallo Wereld]";
	}
	
	public String toString() {
	return String.format("Communication: %s", this.communicationText);	
		
	}
	

}
