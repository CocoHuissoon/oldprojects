package Droidfactorymodels;

public class Droid {
	private static int droidCounter=1;
	private final int serialNumber;
	private String designation;
	private Workable module;
	
	public Droid(Workable module, String designation) {
		super();
		this.module=module;
		this.designation=designation;
		this.serialNumber=droidCounter++;
	}
	
	public void updateModule (String designation, Workable module) {
		this.module=module;
		this.designation=designation;
	}
	public String toString() {
		return String.format("Designation: %s, serial: %d", this.designation,this.serialNumber);
	}



	public void doWork() {
		this.module.work();
	}

}
