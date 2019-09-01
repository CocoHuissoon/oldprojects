package mainVoetbalScores;

import java.util.*;
import model.Wedstrijd;

public class VoetbalScoresLauncher implements Comarable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Wedstrijd wedstrijd1 = new Wedstrijd("PEC", 4, 3);
		wedstrijd1.getWedstrijdPunten();
		wedstrijd1.printUitslag();
		wedstrijd1.printWedstrijdPunten();
		Wedstrijd wedstrijd2 = new Wedstrijd();
		System.out.println("\nWelke tegenstander?");
		String wedstijd2Tegenstander = sc.nextLine();
		wedstrijd2.setNaamTegenStander(wedstijd2Tegenstander);
		System.out.println(wedstrijd2.getNaamTegenStander());
		System.out.println("Hoeveel punten hebben jullie gescoord?");
		wedstrijd2.setDoelpuntenVoor(sc.nextInt());
		System.out.println("En hoeveel hebben zij gescoord?");
		wedstrijd2.setDoelpuntenTegen(sc.nextInt());
		wedstrijd2.printUitslag();
		wedstrijd2.getWedstrijdPunten();
		wedstrijd2.printWedstrijdPunten();
		

	}

}
