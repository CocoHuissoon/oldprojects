package cirkelNew;

import java.util.Scanner;

public class Cirkel {
	/*
	 * Dit programma vraag om de straal en geeft de oppervlakte van de cirkel terug
	 */
	public static void main(String[] args) {
		double PI= 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Geef de straal van een cirkel: ");
		double radius=input.nextDouble();
		double area=Math.pow(radius, 2)*Math.PI;
		System.out.println(area);
		
		

	}

}
