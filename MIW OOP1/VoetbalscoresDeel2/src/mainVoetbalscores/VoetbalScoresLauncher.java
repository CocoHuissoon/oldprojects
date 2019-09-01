package mainVoetbalscores;
import java.util.ArrayList;
import java.util.stream.Stream;

import model.Team;
public class VoetbalScoresLauncher {

	public static void main(String[] args) {
		Team team1 = new Team("Twente", 15, 28, 13);
		
		team1.printStatusTeam();
		ArrayList<String>numbers= new ArrayList<>();
		numbers.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);
		

	}

}
