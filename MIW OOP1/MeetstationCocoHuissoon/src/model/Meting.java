package model;

public  abstract class Meting {
	private String opmerking;
	private String naam;
	
	public Meting(String opmerking, String naam) {
		this.opmerking = opmerking;
		this.naam = naam;

	}

	public Meting() {
		this(null, null);

	}
	
	public String toString() {
		return String.format("%s | %s", (this.opmerking==null?"Opmerking ontbreekt":this.opmerking),(this.naam==null?"naam ontbreekt":this.naam));
	}

	

}
