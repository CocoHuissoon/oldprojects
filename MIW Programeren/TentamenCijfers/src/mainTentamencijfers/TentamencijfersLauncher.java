package mainTentamencijfers;
import java.util.*;
public class TentamencijfersLauncher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total=0;
		
		System.out.print("Hoeveel cijfers wilt u invoeren?");
		int antwoord= input.nextInt();
		while(antwoord==0) {
			System.out.println("Aantal cijfers moet groter zijn dan 0!");
			System.out.println("Hoeveel cijfers wilt u invoeren?");
			antwoord= input.nextInt();
			
		}
		double []cijferStudent=new double[antwoord];
		for(int i=0;i<antwoord;i++) {
	
			System.out.println("Wat is het Cijfer van Student "+(i+1));
			 cijferStudent[i]=input.nextDouble();
			 krijgHoogsteCijfer(cijferStudent);
			total+=cijferStudent[i];
			
			
		}
		
		System.out.println("Aantal cijfers is " +(int)cijferStudent.length);
		System.out.printf("Gemmidelde cijfer is: %.1f\n",gemiddelde);
		System.out.println("Hoogste cijfer is: "+ hoogsteCijfer);
		System.out.println("Aantal voldoendes is: "+krijgAantalVoldoendes());
		
		

	}
	public static double krijgGemiddelde(double total, int antwoord) {
		double gemiddelde=0;
		gemiddelde=total/antwoord;

		return gemiddelde;
		
	}
	public static int krijgAantalVoldoendes(double cijferStudent, int antwoord) {
		int aantalVoldoendes=0;
		for(int i=0; i<antwoord;i++)
		if (cijferStudent>5.5) {
			 aantalVoldoendes++;
		}
		
		return aantalVoldoendes;
	}
	public static double krijgHoogsteCijfer(double cijferStudent) {
		double cijferStudent;
		double hoogsteCijfer=0;
		if(cijferStudent[i]>=hoogsteCijfer) {
			 hoogsteCijfer= cijferStudent[i];
			
		}
		
		return hoogsteCijfer;
	}

}
