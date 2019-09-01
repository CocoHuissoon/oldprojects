package nl.hva.miw.oop2.c12.hertentamen.Taxateur;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Een taxateur kan de totale waarde van een aantal dingen inschatten en een
 * totale waarde afgeven.
 * 
 * Deze taxateur gebruikt geen lijst maar een algemener type "Collection". In
 * dit geval een HashSet. Lees de java API documentatie als je meer van deze
 * types wilt weten.
 * 
 * @author michel
 *
 */
public class Taxateur<T>  {

	Collection<T> taxatieSpullen = new HashSet<>();
	T t;
	
	/**
	 * Voeg een sieraad toe aan de taxatieSpullen.
	 * 
	 * @param s
	 * @throws NegatieveWaardeException 
	 * @throws NegatieveWaarde
	 */
	public void voegToe(T t) throws NegatieveWaardeException {
		if(t.equals(0)) {
			throw new NegatieveWaardeException(t);
		}
		this.taxatieSpullen.add(t);
	}

	/**
	 * Taxeert alle spullen van deze taxateur en geeft de totale waarde van deze
	 * spullen.
	 * 
	 * De totale waarde is de som van de waardes van de individuele spullen. De
	 * waarde van de individuele spullen wordt opgevraagd door de aanroep van
	 * "getWaarde()".
	 * 
	 * @param <T>
	 * 
	 * @return
	 */
	public <T> double taxeerTotaleWaarde() {
		double totaal = 0;
		for (Iterator iterator = taxatieSpullen.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			totaal += ((Waardevol) t).getWaarde();

		}

		return totaal;
	}

	
}
