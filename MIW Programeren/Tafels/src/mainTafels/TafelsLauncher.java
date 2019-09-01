package mainTafels;

import java.util.Scanner;

public class TafelsLauncher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welke tafel wilt u printen (0=stoppen)?");
		int tafel = input.nextInt();
		if (tafel == 0) {

		} else {
			System.out.println("De tafel van: " + tafel);
			System.out.print("Hoeveel getallen wilt u printen?");
			int aantal = input.nextInt();

			for (int i = 1; i <= aantal; i++) {

				int uitkomst = tafel * i;
				if (i % 5 == 0) {
					System.out.print("\t" + uitkomst + " \n");
				} else {
					System.out.print("\t" + uitkomst);
				}
			}
		}
	}
}