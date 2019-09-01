package nl.hva.miw.oop2.c12.hertentamen.Taxateur;

/**
 * Een Sieraad is iets met waarde.
 * 
 * @author michel
 *
 */
public class Sieraad implements Waardevol {
	
	private String naam;
	private double waarde;
	
	public Sieraad(String naam, double waarde) {
		super();
		this.naam = naam;
		this.waarde = waarde;
	}

	@Override
	public double getWaarde() {
		return this.waarde;
	}

	@Override
	public String toString() {
		return "Sieraad [naam=" + naam + ", waarde=" + waarde + "]";
	}
}
