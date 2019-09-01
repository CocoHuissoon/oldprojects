package mainAgeCalcultion;
import java.util.Scanner;
public class AgeCalculationLauncher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String naam=input.nextLine();
		int geboorteJaar=input.nextInt();
		final int jaar= 2018;
		int leeftijd=jaar-geboorteJaar;
		System.out.println("Hoe heet je? " + naam);
		System.out.println("Wat is je geboortejaar? " + geboorteJaar);
		System.out.println("Beste " +naam+", in " + jaar+ " zal je leeftijd " + leeftijd + " zijn");
		
		if (leeftijd>=50) {
			System.out.println("Ondanks je leeftijd zie je er nog best goed uit!");
		}else {
			System.out.println("Je bent nog lang niet toe aan pensioen");
		}
		

	}
	

}
