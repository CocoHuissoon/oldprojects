package nl.hva.miw.oop2.c12.hertentamen.boodschappen;

import java.util.Comparator;

public class Artikel implements Comparable<Artikel>/*, Comparator<Artikel>*/ {
	
	private int artikelNr;
	private String naam;
	private double prijs;

	public Artikel(int artikelNr, String naam, double prijs) {
		super();
		this.artikelNr = artikelNr;
		this.naam = naam;
		this.prijs = prijs;
	}

	public int getArtikelNr() {
		return artikelNr;
	}

	public String getNaam() {
		return naam;
	}

	public double getPrijs() {
		return prijs;
	}

	@Override
	public String toString() {
		return "Artikel [artikelNr=" + artikelNr + ", naam=" + naam + ", prijs=" + prijs + "]";
	}

	
	//artikel wordt eerst vergeleken op artikel nr als ze gelijk zijn worden ze vergeleken op prijs
	@Override
	public int compareTo(Artikel o) {
		if(this.equals(o)) {
//			compare(this,o);
		}
		return this.getArtikelNr()-o.getArtikelNr();
	}

//	@Override
//	public int compare(Artikel o1, Artikel o2) {
//		return (int) (o1.getPrijs()-o2.getPrijs());
//	}
	
	

	

	
}
