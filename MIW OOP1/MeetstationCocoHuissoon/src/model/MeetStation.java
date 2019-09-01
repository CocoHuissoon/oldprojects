package model;

import java.util.ArrayList;

public class MeetStation {
	private final static String GEEN_BESCHRIJVING = "GEEN_BESCHRIJVING";
	private ArrayList<Meting> metingen;
	private String beschrijving;
	private int totaal = 0;

	public MeetStation(String beschrijving) {
		this.beschrijving = beschrijving;
		this.metingen = new ArrayList<>();
	}

	public MeetStation() {
		this(GEEN_BESCHRIJVING);

	}

	public MeetStation voegmetingToe(Meting meting) {
		if (meting instanceof SingleMeting) {
			totaal++;
		} else {
			totaal += ((MultiMeting) meting).getAantalMetingen();
		}
		this.metingen.add(meting);
		return this;
	}

	public void toonRapport() {
		System.out.printf("Rapportage: %s\nTotaal aantal metingen %d\n", this.beschrijving, this.totaal);

		for (Meting m : metingen) {

			System.out.println(m + "\n");
		}

	}

}
