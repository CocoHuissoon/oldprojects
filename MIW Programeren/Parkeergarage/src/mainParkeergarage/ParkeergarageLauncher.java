package mainParkeergarage;
// Scanner in dit programma werk niet helemaal goed, kon exacte probleem niet vinden.
import java.util.Scanner;

public class ParkeergarageLauncher {
	// Methode die parkeergeld berekent aan de hand van parkeerduur.
	public static double berekenenParkeergeld(int parkeerDuur) {
		double parkeerKosten = 0;
		if (parkeerDuur <= 3) {
			parkeerKosten = parkeerDuur * 3.75;
		}

		if (parkeerDuur > 3) {

			double extraKosten = (double) (parkeerDuur - 3) * 2.75;
			parkeerKosten += extraKosten + 11.25;
		}
		if (parkeerKosten > 25.0) {
			parkeerKosten = 25.0;
		}
		return parkeerKosten;
	}

	public static void main(String[] args) {
		System.out.println("Naam: Coco Huissoon. Studentnummer: 500603152");
		Scanner sc = new Scanner(System.in);
		// Gebruiker voert aantal geparkeerde autos in.
		System.out.printf("Hoeveel auto's hebben geparkeerd?");
		int aantalAuto = sc.nextInt();
		// Variabele die totaal van de parkeerkosten bepaald.
		double totaal = 0;
		// Array initialisatie voor kentekens, parkeerduur en parkeerkosten.
		// Grootte van de arrays wordt bepaald door aantal auto's dat de gebruiker
		// invoert.
		String[] kenteken = new String[aantalAuto];
		int[] parkeerDuur = new int[aantalAuto];
		double[] parkeerKosten = new double[aantalAuto];

		// In deze loop voert de gebruiker per auto het kenteken en de parkeerduur in.
		for (int i = 0; i < aantalAuto; i++) {

			System.out.printf("Auto %d\n", i + 1);
			System.out.println("\tKenteken: ");
			kenteken[i] = sc.next();
			System.out.println("\tGeparkeerde uren (max 24): \n");
			parkeerDuur[i] = sc.nextInt();
			// Als de parkeerduur boven de 24 is zorgt dit statement ervoor dat het niet
			// hoger dan 24 wordt.
			if (parkeerDuur[i] > 24) {
				System.out.println("De parkeerduur kan maximaal 24 uur zijn.");
				parkeerDuur[i] = 24;
				System.out.println("\tGeparkeerde uren (max 24): \n" + parkeerDuur[i]);
			}
			// parkeerkosten per auto wordt hier berekent door de methode op te roepen.
			parkeerKosten[i] = berekenenParkeergeld(parkeerDuur[i]);

		}
		// Hier word het overzicht uitgeprint en het totaal van de parkeerkosten
		// berekend.
		System.out.println("Parkeer overzicht");
		System.out.println("kenteken\turen\tbedrag");
		for (int i = 0; i < aantalAuto; i++) {
			System.out.printf("%s\t%d\t%f\n", kenteken[i], parkeerDuur[i], parkeerKosten[i]);
			totaal += parkeerKosten[i];
		}
		System.out.printf("Totaal van alle parkeergelden: %f euro", totaal);

	}

}
