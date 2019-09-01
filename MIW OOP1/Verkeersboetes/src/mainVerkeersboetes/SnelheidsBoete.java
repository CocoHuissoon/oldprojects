package mainVerkeersboetes;

public class SnelheidsBoete extends VerkeersBoete {
	private int gemetenSnelheid;  
	private int maximumSnelheid;
	private int hoeHard;
	public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid,int maximumSnelheid ) {
		super(naamDader,kentekenAuto);
		this.gemetenSnelheid=gemetenSnelheid;
		this.maximumSnelheid=maximumSnelheid;
	}
	public int getGemetenSnelheid() {
		return gemetenSnelheid;
	}
	public void setGemetenSnelheid(int gemetenSnelheid) {
		this.gemetenSnelheid = gemetenSnelheid;
	}
	public int getMaximumSnelheid() {
		return maximumSnelheid;
	}
	public void setMaximumSnelheid(int maximumSnelheid) {
		this.maximumSnelheid = maximumSnelheid;
	}
	public void bepaalBedrag() {
		hoeHard=gemetenSnelheid-maximumSnelheid;
		if(hoeHard>0&&hoeHard<=10) {
			super.setBedrag(hoeHard*10);
		}else if(hoeHard>10&&hoeHard<=30) {
			super.setBedrag(hoeHard*15);
		}else if(hoeHard>30) {
			super.setBedrag(hoeHard*20);
		}
	}
	@Override
	public String toString() {
		return String.format("Snelheidsboete voor %s, kenteken %s, %.0f euro voor %d km/u waar %d km/u istoegestaan",
				getNaamDader(),getKentekenAuto(),getBedrag(),gemetenSnelheid,maximumSnelheid);
	}
	

}
