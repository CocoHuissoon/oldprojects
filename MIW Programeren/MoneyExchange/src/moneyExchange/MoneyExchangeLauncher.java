package moneyExchange;

public class MoneyExchangeLauncher {

	public static void main(String[] args) {
		final double US_KOERS = 1.23843;
		final double UK_KOERS = 0.88459;
		final double JP_KOERS = 134.64711;
		int euros = 100;
		// double dollarsVanEuros = (double) euros * US_KOERS;
		// double dollarsVanEuros2 = (double) Math.round(dollarsVanEuros * 100) / 100;
		// double pondenVanEuros = (double) euros * UK_KOERS;
		// double pondenVanEuros2 = (double) Math.round(pondenVanEuros * 100) / 100;
		// double yenVanEuros = (double) euros * JP_KOERS;
		// double yenVanEuros2 = (double) Math.round(yenVanEuros * 100) / 100;

		// System.out.println("In te wisselen bedrag (alleen gehele getallen): " +
		// euros);
		// System.out.println("U krijgt hiervoor " + dollarsVanEuros2 + " Dollar. (Koers
		// " + US_KOERS + ")");
		// System.out.println("U krijgt hiervoor " + pondenVanEuros2 + " Dollar. (Koers
		// " + US_KOERS + ")");
		// System.out.println("U krijgt hiervoor " + yenVanEuros2 + " Dollar. (Koers " +
		// US_KOERS + ")");
		transactieKosten(euros, US_KOERS, UK_KOERS, JP_KOERS);

	}
	/*
	 * In te wisselen bedrag (alleen gehele getallen): 100 De transactiekosten
	 * bedragen 2.0 Euro. We rekenen daarom 98 Euro voor u om. U krijgt hiervoor 121
	 * Dollar. (Koers 1.23843) U krijgt hiervoor 87 Pond. (Koers 0.88459) U krijgt
	 * hiervoor 13195 Yen. (Koers 134.64711)
	 */

	public static void transactieKosten(int euros, double US_KOERS, double UK_KOERS, double JP_KOERS) {
		System.out.println("In te wisselen bedrag (alleen gehele getallen):" + euros);
		System.out.println("");
		double kosten1 = (double) euros * 0.015;
		double kosten = (double) Math.round(kosten1 * 10) / 10;
		int kostenFinal = (int) Math.rint(kosten);
		int overblijfsel = (int) (euros - kosten);
		if (kosten < 2.0) {
			System.out.println("De transactiekosten bedragen 2 Euro.");
		} else if (kosten > 15.0) {
			System.out.println("De transactiekosten bedragen 15 Euro.");
		} else {
			System.out.println("De transactiekosten bedragen " + kostenFinal + " Euro.");
		}
		double dollarsVanEuros = (double) overblijfsel * US_KOERS;
		int dollarsVanEuros2 = (int) Math.round(dollarsVanEuros);
		double pondenVanEuros = (double) overblijfsel * UK_KOERS;
		int pondenVanEuros2 = (int) Math.round(pondenVanEuros);
		double yenVanEuros = (double) overblijfsel * JP_KOERS;
		int yenVanEuros2 = (int) Math.round(yenVanEuros);
		System.out.println("We rekenen daarom " + overblijfsel + " voor u om.");
		System.out.println("U krijgt hiervoor " + dollarsVanEuros2 + " Dollar. (Koers " + US_KOERS + ")");
		System.out.println("U krijgt hiervoor " + pondenVanEuros2 + " Pond. (Koers " + UK_KOERS + ")");
		System.out.println("U krijgt hiervoor " + yenVanEuros2 + " Yen. (Koers " + JP_KOERS + ")");
	}
}
