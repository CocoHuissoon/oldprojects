package textfilers;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Schrijfnaarfile {
	
	public Schrijfnaarfile() {
		super();
	}
	public void schrijfWeg(String url) {
		Scanner sc = new Scanner(System.in);
		int antwoord;
		try (BufferedWriter f = new BufferedWriter(new FileWriter(new File(url)))) {
			System.out.println("Hoeveel zinnen wil je schrijven?");
			antwoord = sc.nextInt();
			//Haal buffer leeg van enter
			sc.nextLine();
			for (int i = 1; i <=antwoord; i++) {
				System.out.println("Voer de text in");
				String s=sc.nextLine();
				f.write(s);
				f.newLine();
				
			}
			f.close();
			sc.close();

		} catch (IOException e) {
			System.out.println("Kan file niet schrijven");
		}

	}

}
