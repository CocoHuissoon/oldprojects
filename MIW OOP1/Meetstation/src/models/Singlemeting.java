package models;







public class Singlemeting extends Meting {
	private double waarde;
	
    
   
  
	public Singlemeting(double waarde,String opmerking, String naam) {
		super(opmerking,naam);
		this.waarde=waarde;
				
	}
	public Singlemeting(double waarde) {
		this(waarde, "", "");
				
	}
	@Override
	public String toString() {
		return String.format("%.1f: %s",this.waarde,super.toString());
	}

	

}
