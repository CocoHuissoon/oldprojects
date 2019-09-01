package mainZoekGetal;
import java.util.Scanner;
public class ZoekGetalLauncher {

	public static void main(String[] args) {
		System.out.printf("Hoe groot moet de array zijn (5..25)?");
		Scanner input=new Scanner(System.in);
		int getal=input.nextInt();
		System.out.printf("\t"+getal);
		int []arr={getal};
		arr.length= getal;
		System.out.println(arr.length);
				
		

	}

}
