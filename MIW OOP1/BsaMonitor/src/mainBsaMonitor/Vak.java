package mainBsaMonitor;

public class Vak {
	private String naam;
	private int punten;
	private double cijfer;

	Vak(String nieuweNaam, int nieuwePunten) {
		this.naam = nieuweNaam;
		this.punten = nieuwePunten;
	}

	public String getNaam() {
		return naam;
	}

	public int getPunten() {
		return punten;
	}

	public double getCijfer() {
		return cijfer;
	}

	public void setCijfer(double cijfer) {
		this.cijfer = cijfer;
	}
	
	void behaaldePunten() {
		if (cijfer >= 5.5) {
			this.punten=12;
		}else {
			this.punten=0;
		}
	}
	public String toString () {
		return String.format("Vak/Project: %s: %.1f Punten: %d", naam,cijfer,punten);
	}

}
