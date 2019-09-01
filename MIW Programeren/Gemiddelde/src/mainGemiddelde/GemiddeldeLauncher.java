package mainGemiddelde;

import java.util.Scanner;

public class GemiddeldeLauncher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dit programma berekent het gemiddelde van twee of meer getallen.");
		System.out.println("Geef het eerste getal: ");
		int getal1 = input.nextInt();
		System.out.println("Geef het tweede getal: ");
		int getal2 = input.nextInt();

		System.out.println("Wil je van meer getallen het gemiddelde bepalen (ja/nee)?");
		Scanner praat = new Scanner(System.in);
		String antwoordGebruiker = praat.nextLine();

		if (antwoordGebruiker.equals("ja")) {
			int loop=2;
			while (antwoordGebruiker.equals("ja")) {
			loop++;
			double gemiddelde1 = (double) (getal1 + getal2+input.nextInt()) / loop;
				System.out.println("Wil je van meer getallen het gemiddelde bepalen (ja/nee)?");
				String antwoordGebruiker2 = praat.nextLine();
				if(antwoordGebruiker2.equals("nee")) {
				System.out.printf("Het gemiddelde van jouw %d getallen is %f",loop,gemiddelde1);
				break;
				}

			}
		}
		if (antwoordGebruiker.equals("nee")) {
			double gemiddelde2 = (double) (getal1 + getal2) / 2;
			System.out.println(gemiddelde2);

		}
	}

}
