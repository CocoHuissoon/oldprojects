package nl.hva.miw.oop2.c12.hertentamen.boodschappen;


;

public class Launcher {

	public static void main(String[] args) {
		run();
		

	}
	public static void run() {
		
		
		
		System.out.println("Tentamen van Coco Huissoon studentnr 500603152");
		Boodschappenlijst l = new Boodschappenlijst();
		l.voegArtikelToe(new Artikel(3,"koffie",3.3));
		l.voegArtikelToe(new Artikel(2,"pindas",5.3));
		l.voegArtikelToe(new Artikel(1,"kaas",1.3));
		Boodschappenlijst.sorteer(l.getLijstArtikelen());
		l.printBoodschappenLijst();
//		List <Artikel>r=sorteer(l.getLijstArtikelen());
	
		
	}

}
