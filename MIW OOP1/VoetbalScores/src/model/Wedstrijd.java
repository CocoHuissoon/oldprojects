package model;

public class Wedstrijd {
	private String naamTegenStander;
	private int voorDoelPunten;
	private int tegenDoelPunten;
	private int wedstrijdPunten;

	public Wedstrijd() {
		this.naamTegenStander = "Onbekend";
		this.voorDoelPunten = 0;
		this.tegenDoelPunten = 0;
	}

	public Wedstrijd(String naamTegenStander) {
		this.naamTegenStander = naamTegenStander;
		this.voorDoelPunten = 0;
		this.tegenDoelPunten = 0;
	}

	public Wedstrijd(String naamTegenStander, int voorDoelPunten, int tegenDoelPunten) {
		this.naamTegenStander = naamTegenStander;
		this.voorDoelPunten = voorDoelPunten;
		this.tegenDoelPunten = tegenDoelPunten;

	}

	public void setNaamTegenStander(String naam) {
		this.naamTegenStander = naam;
	}

	public String getNaamTegenStander() {
		return this.naamTegenStander;
	}

	public void setDoelpuntenVoor(int punten) {
		this.voorDoelPunten = punten;
	}

	public int getDoelpuntenVoor() {
		return this.voorDoelPunten;
	}

	public void setDoelpuntenTegen(int punten) {
		this.tegenDoelPunten = punten;
	}

	public int getDoelpuntenTegen() {
		return this.tegenDoelPunten;
	}

	public int getWedstrijdPunten() {
		wedstrijdPunten = 0;
		if (voorDoelPunten > tegenDoelPunten) {
			wedstrijdPunten = 3;
		}
		if (voorDoelPunten == tegenDoelPunten) {
			wedstrijdPunten = 1;
		}
		return wedstrijdPunten;
	}

	public void printUitslag() {
		System.out.printf("Uitslag van de wedstrijd tegen %s: %d-%d", naamTegenStander, voorDoelPunten,
				tegenDoelPunten);
	}

	public void printWedstrijdPunten() {
		System.out.printf("\nDit levert %d punten op", wedstrijdPunten);
	}

}
