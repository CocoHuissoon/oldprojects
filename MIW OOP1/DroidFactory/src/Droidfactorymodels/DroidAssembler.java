package Droidfactorymodels;

public class DroidAssembler  {

	private final static String TEXT_ENCODER_DESIGNATION = "Text Encoder Droid";
	private final static String TEXT_REPEATER_DESIGNATION = "Text Repeater Droid";

	public DroidAssembler() {

	}
	
	public Droid assemble (Workable module) {
		String s= "Designation unkown";
		if(module instanceof TextEncoder) {
			s=TEXT_ENCODER_DESIGNATION;
		}else {
			s=TEXT_REPEATER_DESIGNATION;
		}
		return Droid assembledDroid=new Droid(module,s);
		System.out.printf("Created Droid: %s", assembledDroid.toString());
	}
	
	

}
