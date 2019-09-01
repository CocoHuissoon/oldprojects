package nl.hva.miw.oop2.c12.hertentamen.Taxateur;

public class NegatieveWaardeException extends Exception {
	public <T> NegatieveWaardeException(T t) {
		super(t.toString()+" kan niet worden toegevoegd omdat de waarde onder de 0 ligt!");
	}

}
