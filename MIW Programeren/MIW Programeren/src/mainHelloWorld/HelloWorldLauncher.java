package mainHelloWorld;
import java.util.Scanner;

public class HelloWorldLauncher {

	public static void main(String[] args) {
		/*System.out.println("Merry Christmas!\n\n      *\n    * * *\n     * *\n   * * * *\n    * * *\n  * * * * *\n      *");
		System.out.println("Hoe heet jij?");
		Scanner myScanner = new Scanner(System.in);
		String naam;
		naam=myScanner.next();
		System.out.println("Hallo "+naam+", ouwe schobbejak!");
		*/
		Scanner myScanner = new Scanner (System.in);
		int x =myScanner.nextInt();
		int y =myScanner.nextInt();
		double z= (double)x/y;
		System.out.println("De som van x en y is: "+ (x+y));
		System.out.println("Het product van x en y is: "+ (x*y));
		System.out.println("Het quotient van x en y is: "+ z);
		if (x<y) {
			System.out.println("Het grootste getal is y: " + y);
			
		}else {
			System.out.println("Het grootste getal is x: " + x);
		}
		String mijnNaam="Coco      ";
		System.out.println(mijnNaam.length());

	}

}
