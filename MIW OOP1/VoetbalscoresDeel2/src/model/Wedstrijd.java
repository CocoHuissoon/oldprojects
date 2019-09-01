package model;

public class Wedstrijd {
	private Team thuisTeam;
	private Team uitTeam;
	private int voorDoelpunten;
	private int tegenDoelpunten;



	public Wedstrijd(Team thuisTeam, Team uitTeam, int voorDoelpunten, int tegenDoelpunten) {
		super();
		this.thuisTeam = thuisTeam;
		this.uitTeam = uitTeam;
		this.voorDoelpunten = voorDoelpunten;
		this.tegenDoelpunten = tegenDoelpunten;
	}

	public Wedstrijd(Team thuisTeam, Team uitTeam) {
		this(thuisTeam, uitTeam, 0, 0);
	}

	public Wedstrijd() {
		this(new Team(),new Team());
	}

	public Team getThuisTeam() {
		return thuisTeam;
	}

	public void setThuisTeam(Team thuisTeam) {
		this.thuisTeam = thuisTeam;
	}

	public Team getUitTeam() {
		return uitTeam;
	}

	public void setUitTeam(Team uitTeam) {
		this.uitTeam = uitTeam;
	}

	public int getVoorDoelpunten() {
		return voorDoelpunten;
	}

	public void setVoorDoelpunten(int voorDoelpunten) {
		this.voorDoelpunten = voorDoelpunten;
	}

	public int getTegenDoelpunten() {
		return tegenDoelpunten;
	}

	public void setTegenDoelpunten(int tegenDoelpunten) {
		this.tegenDoelpunten = tegenDoelpunten;
	}
	public int getWedstrijdPuntenThuisTeam() {
		int wedstrijdPuntenThuisTeam = 0;
		if (voorDoelpunten>tegenDoelpunten) {
			wedstrijdPuntenThuisTeam=3;
		}
		if (voorDoelpunten==tegenDoelpunten) {
			wedstrijdPuntenThuisTeam=1;
		}if (voorDoelpunten<tegenDoelpunten) {
			wedstrijdPuntenThuisTeam=0;
		}
		return wedstrijdPuntenThuisTeam;
	}
	

}
