package nl.hva.miw.generic;

public class Cola {
	private String merk;
	public Cola(String merk){
		this.merk=merk;
	}
	
	@Override
	public String toString() {
		return "Cola "+this.merk;
	}
}
