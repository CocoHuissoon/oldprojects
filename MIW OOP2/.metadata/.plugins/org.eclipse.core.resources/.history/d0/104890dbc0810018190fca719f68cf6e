package nl.hva.miw.oop2.c12.hertentamen.Taxateur;

public class Launcher {

	public static void main(String[] args) {
		run();

	}
	public static void run() {
		Taxateur t= new Taxateur();
		try {
			t.voegToe(new Sieraad("ketting",4444.4));
			t.voegToe(new Sieraad("kroon",5555.5));
			t.voegToe(new Sieraad("ketting",666.4));
			System.out.println(t.taxeerTotaleWaarde());} 
		catch (NegatieveWaardeException e) {
			System.out.println("Waarde te laag  "+e.getMessage());
		}
		Taxateur r= new Taxateur();
		try {
			r.voegToe(new Sieraad("ketting",5));
			r.voegToe(new Sieraad("kroon",-4));
			r.voegToe(new Sieraad("ketting",3));
			System.out.println(r.taxeerTotaleWaarde());} 
		catch (NegatieveWaardeException e) {
			System.out.println("Waarde te laag  "+e.getMessage());
		}
	}

}
