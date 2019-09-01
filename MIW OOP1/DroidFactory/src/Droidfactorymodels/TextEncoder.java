package Droidfactorymodels;
import java.util.*;
public class TextEncoder extends TextCommunicationModule {
	StringBuilder code = new StringBuilder();

	public TextEncoder(String communicationText) {
		super(communicationText);
		
	}
	
	@Override
	public void work() {
		StringBuilder code = new StringBuilder(super.toString());
		
		System.out.println(code.reverse());
		
	}
	 
	

	

}
