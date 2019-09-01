package model;

public class SingleMeting extends Meting {
	private double waarde;


	
	public SingleMeting(double waarde,String opmerking, String naam) {
		super(opmerking,naam);
		this.waarde=waarde;
				
	}
	public SingleMeting(double waarde) {
		this(waarde, null, null);
				
	}
	
	@Override
	public String toString() {
		return String.format("%.1f: %s",this.waarde,super.toString());
	}
	

}
