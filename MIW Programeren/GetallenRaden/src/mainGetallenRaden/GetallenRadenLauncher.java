package mainGetallenRaden;
import java.util.*;
import java.util.Arrays;

public class GetallenRadenLauncher {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties:");
		int getal1 =input.nextInt();
		int getal2 =input.nextInt();
		int getal3 =input.nextInt();
		System.out.printf("%d %d %d",getal1,getal2,getal3);		
		int random[]=genereerGetallen();
		System.out.println(Arrays.toString(random));
		
		
	
	
	}
	public static int[] genereerGetallen() {
		int[] Getallen = new int[3];
		while(Getallen[0]&&Getallen[1]&&Getallen[2]) {
		for (int i = 0; i < 3; i++) {
			Getallen[i] = ((int) (Math.random() * 10) + 1);
		}
		
		return Getallen;

	}
	public static boolean komtVoorIn(int zoekgetal, int[] lijst) {
		
		
		return false;
		
	}

	

}
}