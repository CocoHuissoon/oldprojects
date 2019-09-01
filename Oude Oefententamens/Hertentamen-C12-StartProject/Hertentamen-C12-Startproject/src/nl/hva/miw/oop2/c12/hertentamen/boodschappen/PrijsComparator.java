package nl.hva.miw.oop2.c12.hertentamen.boodschappen;

import java.util.Comparator;

class prijsComparator implements Comparator<Artikel> {

	@Override
	public int compare(Artikel o1, Artikel o2) {
		return o1.getPrijs() < o2.getPrijs() ? -1 : o1.getPrijs() == o2.getPrijs() ? 0 : 1;
	}
}
