package models;

public abstract class Meting {
	private String opmerking;
	private String naam;

	public Meting() {
		this("", "");

	}

	public Meting(String opmerking, String naam) {
		this.opmerking = opmerking;
		this.naam = naam;

	}

	
	@Override
	public String toString() {

	return String.format("%s%s",
            (this.opmerking == null ? "" : this.opmerking ), 
            (this.naam == null ? "" : " | " + this.naam ));
}

}


