package nl.hva.miw.oop2.c12.hertentamen.boodschappen;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoodschappenlijstTest {

	@Test
	public void testVoegArtikelToe() {
		
	}

	@Test
	public void testGetLijstArtikelen() {
		
	}

	@Test
	public void testPrintBoodschappenLijst() {
		fail("Not yet implemented");
	}

	@Test
	public void testSorteer() {
		Boodschappenlijst l = new Boodschappenlijst();
		l.voegArtikelToe(new Artikel(3,"koffie",3.3));
		l.voegArtikelToe(new Artikel(2,"pindas",5.3));
		l.voegArtikelToe(new Artikel(1,"kaas",1.3));
		l.voegArtikelToe(new Artikel(5,"melk",7.3));
		l.sorteer();
		int expected=1;
		int actual=l.getLijstArtikelen().get(0).getArtikelNr();
		assertEquals(actual,expected);
	}
	@Test
	public void testSorteer1() {
		Boodschappenlijst l = new Boodschappenlijst();
		l.voegArtikelToe(new Artikel(3,"koffie",3.3));
		l.voegArtikelToe(new Artikel(2,"pindas",5.3));
		l.voegArtikelToe(new Artikel(1,"kaas",1.3));
		l.voegArtikelToe(new Artikel(5,"melk",7.3));
		l.sorteer();
		int expected=5;
		int actual=l.getLijstArtikelen().get(3).getArtikelNr();
		assertEquals(actual,expected);
	}
	@Test
	public void testSorteer2() {
		Boodschappenlijst l = new Boodschappenlijst();
		l.voegArtikelToe(new Artikel(1,"koffie",3.3));
		l.voegArtikelToe(new Artikel(1,"pindas",5.3));
		l.voegArtikelToe(new Artikel(1,"kaas",1.3));
		l.voegArtikelToe(new Artikel(1,"melk",7.3));
		l.sorteer();
		int expected=1;
		int actual=l.getLijstArtikelen().get(3).getArtikelNr();
		assertEquals(actual,expected);
	}


	@Test
	public void testSorteerDoubleDouble() {
		fail("Not yet implemented");
	}

}
