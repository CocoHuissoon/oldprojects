package models;

import java.util.ArrayList;

public class MeetStation {
	private final static String GEEN_BESCHRIJVING="GEEN_BESCHRIJVING";
	private ArrayList<Meting>metingen;
	private String beschrijving;
	private int totaal;
	
	public MeetStation() {
		this(GEEN_BESCHRIJVING);
	}
	public MeetStation(String beschrijving) {
		this.metingen=new ArrayList<>();
		this.beschrijving = beschrijving;
	}
	public MeetStation voegMetingToe(Meting meting) {
		if (meting != null) {
            this.metingen.add(meting);

            verhoogTotaal(meting); // hoeft niet in aparte methode op het tentamen
        }
        return this;
	}
	private void verhoogTotaal(Meting meting) {
        if (meting instanceof Singlemeting) {
            totaal++;
        } else if (meting instanceof MultiMeting) { // let op geen else -1
            totaal += ((MultiMeting) meting).getAantalMetingen();
        }
    }

    public void toonRapport() {
        StringBuilder sb = new StringBuilder(
                String.format("Rapportage: %s\nTotaal aantal metingen: %d\n", this.beschrijving, this.totaal));
        // sorteer aflopend
        for (Meting meting : metingen) {
        	sb.append(meting).append("\n");
            
        }
        System.out.println(sb);
    }

}

	
	
	


