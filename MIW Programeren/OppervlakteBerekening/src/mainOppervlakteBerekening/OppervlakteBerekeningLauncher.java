package mainOppervlakteBerekening;

import java.util.Scanner;

public class OppervlakteBerekeningLauncher {

	public static void main(String[] args) {
		System.out.println("Wil je de oppervlakte van een driehoek uitrekenen? (j/n)");
		Scanner input = new Scanner(System.in);
		

		
		String gebruikerWilSpelen1 = input.nextLine();
		//if (gebruikerWilSpelen.equals("n")) {
			//System.out.println("Het programma wordt nu gestopt.");
		

		while (gebruikerWilSpelen1.equals("j")) {
			int hoogte = (int) (9 * Math.random()) + 2;
			int breedte = (int) (9 * Math.random()) + 2;
			double opperVlakte = (double) (breedte * hoogte) / 2;
			int opperVlakte1 = (int) opperVlakte;
			System.out.printf("Bereken de oppervlakte van\r\n" + "een driehoek met basis = %d en hoogte = %d\n",
					breedte, hoogte);
			double antwoordGebruiker = input.nextDouble();
			if (opperVlakte1 == antwoordGebruiker) {
				System.out.println("Jouw antwoord is goed!");
			} else {
				System.out.println("Jouw antwoord is fout!\r\n" + "Het juiste antwoord is " + opperVlakte1);
			}
			
			System.out.println("Wil je nog een keer?");
			Scanner myScanner=new Scanner(System.in);
			 String gebruikerWilSpelen2 = myScanner.nextLine();
			if (gebruikerWilSpelen2.equals("n")) {
				break;
	
			}
		
		}
		System.out.println("Het programma wordt nu gestopt.");

	}
}
