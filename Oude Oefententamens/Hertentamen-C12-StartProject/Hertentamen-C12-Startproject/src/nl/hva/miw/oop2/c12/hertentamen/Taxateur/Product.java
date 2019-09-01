package nl.hva.miw.oop2.c12.hertentamen.Taxateur;

public class Product implements Waardevol {
	String naam;
	double waarde;
	
	public Product(String naam, double waarde) {
		super();
		this.naam = naam;
		this.waarde = waarde;
	}

	@Override
	public String toString() {
		return "Product [naam=" + naam + ", waarde=" + waarde + "]";
	}

	@Override
	public double getWaarde() {
		// TODO Auto-generated method stub
		return this.waarde;
	}
	

}
