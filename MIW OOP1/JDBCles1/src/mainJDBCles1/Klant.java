package mainJDBCles1;

public class Klant {
	private String naam;
	private String plaats;
	private int klantnummer=0;
	public int getKlantnummer() {
		return klantnummer;
	}
	public void setKlantnummer(int klantnummer) {
		this.klantnummer = klantnummer;
	}
	public Klant( String naam, String plaats) {
		this.naam = naam;
		this.plaats=plaats;
		
	}
	@Override
	public String toString() {
		return "\nKlant [naam=" + naam + ", plaats=" + plaats + ", klantnummer=" + klantnummer + "]\n";
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getPlaats() {
		return plaats;
	}
	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

}
