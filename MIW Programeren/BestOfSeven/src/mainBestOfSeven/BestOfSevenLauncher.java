package mainBestOfSeven;

import java.util.*;

public class BestOfSevenLauncher {

	// Methode die uitprint welk team best of seven gewonnen heeft.
	static void printWinnaar(String teamNaam1, String teamnaam2, int team1Overwinningen, int team2Overwinningen,
			int nrWedstrijd) {
		System.out.printf("\n\nAantal gespeelde wedstrijden: %d\n", nrWedstrijd);
		System.out.printf("%s heeft gewonnen met %d - %d\n", teamNaam1, team1Overwinningen, team2Overwinningen);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dit programma is gemaakt door Coco Huissoon, <klas>, <studentnummer> ");
		// Hier voert gebruiker de teamnamen in.
		System.out.println("Naam van team 1: ");
		String teamNaam1 = input.nextLine();
		System.out.println("Naam van team 2:");
		String teamNaam2 = input.nextLine();
		int[] team1Score = new int[7];
		int[] team2Score = new int[7];
		int team1Overwinningen = 0;
		int team2Overwinningen = 0;
		int nrWedstrijd = 0;
		// Vanaf hier voert de gebruiker scores in tot 1 van de teams 4 overwinningen
		// heeft.
		for (int i = 0; i < team1Score.length; i++) {
			nrWedstrijd = i + 1;
			System.out.printf("\nWat zijn de punten van %s ?\n", teamNaam1);
			team1Score[i] = input.nextInt();
			System.out.printf("\nWat zijn de punten van %s ?\n", teamNaam2);
			team2Score[i] = input.nextInt();
			System.out.printf("Uitslag wedstrijd %d\n\tAantal punten %s: %d\n\tAantal punten %s: %d", nrWedstrijd,
					teamNaam1, team1Score[i], teamNaam2, team2Score[i]);
			if (team1Score[i] > team2Score[i]) {
				team1Overwinningen ++ ;
			} else {
				team2Overwinningen ++;
			}
			// Dit blok test of 1 van de teams 4 overwinningen heeft, zo ja wordt het
			// desbetreffende team uitgeprint.
			if (team1Overwinningen >= 4) {
				printWinnaar(teamNaam1, teamNaam2, team1Overwinningen, team2Overwinningen, nrWedstrijd);
				// System.out.printf("\nAantal gespeelde wedstrijden: %d\n", nrWedstrijd);
				// System.out.printf("%s heeft gewonnen met %d - %d\n", teamNaam1,
				// team1Overwinningen, team2Overwinningen);
				break;
			} else if (team2Overwinningen >= 4) {
				printWinnaar(teamNaam2, teamNaam1, team2Overwinningen, team1Overwinningen, nrWedstrijd);
				// System.out.printf("\nAantal gespeelde wedstrijden: %d\n", nrWedstrijd);
				// System.out.printf("%s heeft gewonnen met %d - %d\n", teamNaam2,
				// team2Overwinningen, team1Overwinningen);
				break;
			}
		}
		// Dit deel geeft een samenvatting van de wedstrijden en de scores.
		for (int i = 1; i <= nrWedstrijd; i++) {
			System.out.printf("\nWedstrijd %d:%s - %s %d - %d", i, teamNaam1, teamNaam2, team1Score[i - 1],
					team2Score[i - 1]);
		}

	}

}