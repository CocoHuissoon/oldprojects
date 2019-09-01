package mainDataStructures;

import java.util.Scanner;

public class DataStructuresLauncher {

	public static void main(String[] args) {
		String naamVak = "DataStructures";
		Scanner input = new Scanner(System.in);
		System.out.println("Hoeveel punten haalde je op toets 1?");
		int puntenToets1 = input.nextInt();
		System.out.println("Hoeveel punten haalde je op toets 2?");
		int puntenToets2 = input.nextInt();
		

		if (puntenToets1 >= 12) {
			double cijferToets1 = (double) ((Math.round(puntenToets1 * 10) / 10) / 2);
			System.out.printf("Je hebt voor toets 1 een voldoende. Je cijfer is een %f\n", cijferToets1);
			if (puntenToets2 >= 12) {
				double cijferToets2 = (double) (Math.round(puntenToets2 * 10) / 10) / 2;
				System.out.printf("Je hebt voor toets 2 een voldoende. Je cijfer is een %f\n", cijferToets2);
				double gemiddeldCijfer = (cijferToets1 + cijferToets2) / 2;
				System.out.printf("Je hebt %s gehaald je cijfer is: %f", naamVak, gemiddeldCijfer);
			}
		}
		if (puntenToets1 < 12 && puntenToets2 < 12) {
			double cijferToets1 = (double) (puntenToets1 - 1.5) / 2;
			double cijferToets2 = (double) (puntenToets2 - 1.5) / 2;
			double eindCijfer= (cijferToets1+cijferToets2)/2;
			System.out.printf("Je hebt voor toets 1 een onvoldoende. Je cijfer is een %f\n", cijferToets1);
			System.out.printf("Je hebt voor toets 2 een onvoldoende. Je cijfer is een %f\n", cijferToets2);
			System.out.printf("Je hebt %s niet gehaald je cijfer is: %f", naamVak, eindCijfer);
		}
		if ((puntenToets1 < 12 && puntenToets2 >= 12)||puntenToets1 >= 12 && puntenToets2 < 12) {
			if (puntenToets1 < puntenToets2) {
				double cijferToets1 = (double) (puntenToets1 - 1.5) / 2;
				System.out.printf("Je hebt %s niet gehaald je cijfer is: %f", naamVak, cijferToets1);
			} else {
				double cijferToets2 = (double) (puntenToets2 - 1.5) / 2;
				System.out.printf("Je hebt %s niet gehaald je cijfer is: %f", naamVak, cijferToets2);

			}
		}
		

		// double kosten = (double) Math.round(kosten1 * 10) / 10;

	}

}
