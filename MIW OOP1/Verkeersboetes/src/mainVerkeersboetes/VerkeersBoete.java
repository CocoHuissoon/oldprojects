package mainVerkeersboetes;

public class VerkeersBoete {
	private String naamDader;
	private String kentekenAuto;
	private double bedrag;
	
	private VerkeersBoete(String naamDader,String kentekenAuto,double bedrag) {
		this.setNaamDader(naamDader);
		this.setKentekenAuto(kentekenAuto);
		this.bedrag=bedrag;
	}
	public VerkeersBoete(String naamDader,String kentekenAuto) {
		this(naamDader,kentekenAuto,0);
	}
	public VerkeersBoete() {
		this("","");
	}
	public double getBedrag() {
		return this.bedrag;
	}
	public void setBedrag(int bedrag) {
		this.bedrag=bedrag;
	}
	public String toString() {
		return String.format("%s %s %f", getNaamDader(),getKentekenAuto(),bedrag);
	}
	public String getNaamDader() {
		return naamDader;
	}
	public void setNaamDader(String naamDader) {
		this.naamDader = naamDader;
	}
	public String getKentekenAuto() {
		return kentekenAuto;
	}
	public void setKentekenAuto(String kentekenAuto) {
		this.kentekenAuto = kentekenAuto;
	}


}
