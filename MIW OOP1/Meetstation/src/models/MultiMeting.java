package models;

public class MultiMeting extends Meting {
	final static private int LEGE_ARRAY = 0;
	private double[] waarden;
	private double gemiddelde;
	private int aantalMetingen;

	public MultiMeting(double[] waarden, String opmerking, String naam) {
		super(opmerking, naam);

		waarden = alsNullVervangMetLegeArray(waarden);

		this.waarden = waarden;
		this.aantalMetingen = waarden.length;

		double tempVoorGemiddelde = gemiddeldeVanMeetwaarden(waarden);
		this.gemiddelde = tempVoorGemiddelde;
	}

	public MultiMeting(double[] waarden) {
		this(waarden, null, null);
	}
	private double[] alsNullVervangMetLegeArray(double[] waarden) {
        if (waarden == null) {
            waarden = new double[LEGE_ARRAY];
        }
        return waarden;
    }



	private double gemiddeldeVanMeetwaarden(double[] waarden) {
		double tempVoorGemiddelde = 0.0;
		if (waarden.length > 0) {
			for (double waarde : waarden) {
				tempVoorGemiddelde += waarde;
			}
			tempVoorGemiddelde /= waarden.length;
		}
		return tempVoorGemiddelde;
	}

	public int getAantalMetingen() {
		return waarden.length;
	}

	@Override
	public String toString() {
		return String.format("%.1f gemiddeld over %d metingen %s", this.gemiddelde, this.aantalMetingen, super.toString());
	}

}
