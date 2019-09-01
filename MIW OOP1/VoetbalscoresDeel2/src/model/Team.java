package model;

public class Team {
	private String teamNaam;
	private int totaalPunten;
	private int totaalVoorDoelpunten;
	private int totaalTegenDoelpunten;

	public Team(String teamNaam, int totaalPunten, int totaalVoorDoelpunten, int totaalTegenDoelpunten) {
		this.teamNaam = teamNaam;
		this.totaalPunten = totaalPunten;
		this.totaalVoorDoelpunten = totaalVoorDoelpunten;
		this.totaalTegenDoelpunten = totaalTegenDoelpunten;
	}

	public Team(String teamnaam) {
		this(teamnaam, 0, 0, 0);
	}

	public Team() {
		this("", 0, 0, 0);
	}
	

	public void setTeamNaam(String naam) {
		this.teamNaam = naam;
	}

	public String getTeamNaam() {
		return this.teamNaam;
	}
	public void setTotaalPunten(int totaalPunten) {
		this.totaalPunten=totaalPunten;
	}
	public int getTotaalPunten() {
		return this.totaalPunten;
	}
	public void setTotaalVoorDoelpunten(int voorPunten) {
		this.totaalVoorDoelpunten=voorPunten;
	}
	public int getTotaalVoorDoelpunten() {
		return this.totaalVoorDoelpunten;
	}
	public void setTotaalTegenDoelpunten(int tegenPunten) {
		this.totaalTegenDoelpunten=tegenPunten;
	}
	public int getTotaalTegenDoelpunten() {
		return this.totaalTegenDoelpunten;
	}
	public int getDoelSaldo() {
		return totaalVoorDoelpunten-totaalTegenDoelpunten;
	}
	public void printStatusTeam() {
		System.out.printf("\nHet team %s heeft %d wedstrijdpunt en een doelsaldo van %d\n",teamNaam,totaalPunten,getDoelSaldo());
	}

}
