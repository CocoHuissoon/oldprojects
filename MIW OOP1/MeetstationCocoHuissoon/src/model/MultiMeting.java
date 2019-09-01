package model;

public class MultiMeting extends Meting {
	final static private int LEGE_ARRAY = 0;
	private double[] waarden;
	private double gemiddelde;
	private int aantalMetingen;
	
	public MultiMeting(double[] waarden, String opmerking, String naam) {
		super(opmerking, naam);
		this.waarden = waarden;
		this.aantalMetingen = waarden.length;
		this.gemiddelde = gemiddelde(waarden);
		
	}
	public MultiMeting(double[]waarden) {
		this(waarden,null,null);
	}
	public double gemiddelde(double []waarden) {
		double gemiddelde=0;
		for(int i=0;i<waarden.length;i++) {
			gemiddelde+=waarden[i];
		}gemiddelde= gemiddelde/waarden.length;
		return gemiddelde;
	}
	public int getAantalMetingen() {
		return this.aantalMetingen=waarden.length;
	}
	@Override
	public String toString() {
		return String.format("%.1f gemiddeld over %d metingen %s", this.gemiddelde, this.aantalMetingen, super.toString());
	}

}
