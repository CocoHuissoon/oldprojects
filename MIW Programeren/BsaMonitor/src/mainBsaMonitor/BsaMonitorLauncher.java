package mainBsaMonitor;

import java.util.Scanner;

public class BsaMonitorLauncher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totaalVakPunten = 0;

		String[] vakNamen = { "Project Fasten Your Seatbelts", "Programming", "Databases", "Personal Skills",
				"Project Skills", "Management & Organization", "Databases" };
		int[] vakPunten = { 12, 3, 3, 2, 2, 3, 3 };
		double[] vakCijfers = { 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < vakNamen.length; i++) {

			System.out.println("Welk cijfer heb je voor " + vakNamen[i] + " ?");
			vakCijfers[i] = input.nextDouble();
			if (vakCijfers[i] < 0 || vakCijfers[i] > 10) {
				System.out.println("Dat is geen geldig cijfer, probeer nog een keer.");
				i--;
			}
			if (vakCijfers[i] < 5.5) {
				vakPunten[i] = 0;

			}
			totaalVakPunten += vakPunten[i];
		}
		for (int i = 0; i < vakNamen.length; i++) {
			System.out.printf("\nVak/project: %s\tCijfer: %.1f Behaalde punten: %d\n", vakNamen[i], vakCijfers[i],
					vakPunten[i]);

		}
		System.out.printf("\nTotaal behaalde studiepunten: %d/28\n", totaalVakPunten);
		if (totaalVakPunten < 24) {

			System.out.println("PAS OP: je ligt op schema voor een negatief BSA! ");
		}
	}

}
