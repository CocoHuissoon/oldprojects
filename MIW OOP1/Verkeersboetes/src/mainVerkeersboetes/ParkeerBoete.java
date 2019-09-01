package mainVerkeersboetes;

public class ParkeerBoete extends VerkeersBoete {
	private int zone;
	
	ParkeerBoete(String naamDader,String kentekenAuto,int zone){
		super(naamDader,kentekenAuto);
		this.zone=zone;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}
	public void bepaalBedrag() {
		if(zone==1) {
			super.setBedrag(60);
		}else if (zone==2) {
			super.setBedrag(100);
		}else if (zone==3) {
			super.setBedrag(180);
		}
	}
	@Override
	public String toString() {
		return String.format("Parkeerboete voor %s, kenteken %s, %.0f euro in zone %d.", getNaamDader(),getKentekenAuto(),getBedrag(),zone);
	}
	
	
	
	
	

}
