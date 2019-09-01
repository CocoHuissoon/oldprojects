package nl.hva.ict.oop2.deel2;

import nl.hva.ict.oop2.deel1.Biertype;

public class Trappist extends Biertype {
	private String naam;
	

	public Trappist(String naam) {
		super();
		this.naam = naam;
	}


	@Override
	public void rijp() {
		rijpweken++;
		System.out.printf(" Trappist %s rijpt nu %d weken \n",this.naam, this.rijpweken);
		
	}

}
