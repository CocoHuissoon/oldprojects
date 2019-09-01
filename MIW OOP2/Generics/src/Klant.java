import java.util.Date;

public class Klant {
	private String naam;
	private int leeftijd;
	private int klantNummer;
	private String adres;
//	private Date datum;
	
	public void setNaam(String naam) {
		this.naam=naam;
	}

	public Klant(String naam, int leeftijd, int klantNummer, String adres) {
		super();
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.klantNummer = klantNummer;
		this.adres = adres;
	}

	

	@Override
	public String toString() {
		return "Klant [naam=" + naam + ", leeftijd=" + leeftijd + ", klantNummer=" + klantNummer + ", adres=" + adres
				+ "]";
	}

	public String getNaam() {
		return naam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public int getKlantNummer() {
		return klantNummer;
	}

	public String getAdres() {
		return adres;
	}

}
