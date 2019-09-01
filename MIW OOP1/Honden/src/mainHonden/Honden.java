package mainHonden;

public class Honden {

	public static void main(String[] args) {
		Hond max = new JackRussel();
		((JackRussel)max).pakKonijn();
		
		/**
		* Bekijkt wat het actuele type van de hond is en
		* voert dan alleen zijn soortspecifieke methode uit
		* in het geval van een algemene Hond is dit blaf()
		* in het geval van een Terrier is dit bijt() zijn
		* in het geval van een Herder is dat zoek() zijn
		* in het geval van een Duitse Herder is dit pakBoef()
		* in het geval van een JackRussel Terrier is dit pakKonijn()
		*
		* @param hond
		*/
	}
	synchronized
		public static void soortSpecifiekeActie(Hond hond){
			hond.blaf();

	}

}
