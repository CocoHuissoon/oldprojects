package mainBMICalculator;

//import java.util.Scanner;

public class BMICalculatorLauncher {

	public static void main(String[] args) {

		// Dit is de Scanner methode maar de methode werkt nu!!!

		/*
		 * Scanner insert = new Scanner(System.in);
		 * System.out.println("Wat is gewicht in kg?"); double gewichtInKilogram =
		 * insert.nextDouble(); System.out.println("Wat is de lengte in cm?"); int
		 * lengteInCentimeter = insert.nextInt(); double lengteInMeter = (double)
		 * lengteInCentimeter / 100; double bmi = gewichtInKilogram / (lengteInMeter *
		 * lengteInMeter); System.out.println("Gewicht in kilogram : " +
		 * gewichtInKilogram); System.out.println("Lengte in centimeter: " +
		 * lengteInCentimeter); System.out.println("BMI: " + bmi);
		 */

		double kg = 62.6;
		int cm = 172;
		System.out.println("Gewicht in kilogram : " + kg);
		System.out.println("Lengte in centimeter: " + cm);

		if (BMI(kg, cm) < 18.5) {
			System.out.println("\nBMI: " + BMI(kg, cm) + " (Ondergewicht)");
		} else if (BMI(kg, cm) >= 18.5 && BMI(kg, cm) <= 25.0) {
			System.out.println("\nBMI: " + BMI(kg, cm) + " (Gezond gewicht)");
		} else if (BMI(kg, cm) >= 25.0 && BMI(kg, cm) <= 30.0) {
			System.out.println("\nBMI: " + BMI(kg, cm) + " (Overgewicht)");
		} else if (BMI(kg, cm) > 30.0) {
			System.out.println("\nBMI: " + BMI(kg, cm) + " (Obesitas)");
		}

	}

	// tot 18,5 Ondergewicht
	// 18,5 – 25,0 Gezond gewicht
	// 25,0 – 30,0 Overgewicht
	// meer dan 30,0 Obesitas

	public static double BMI(double kg, int cm) {
		double cm2 = (double) cm / 100;
		double bmi = kg / Math.pow(cm2, 2);
		return (double) Math.round(bmi * 10) / 10;
	}

}
