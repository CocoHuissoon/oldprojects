import model.MeetStation;
import model.Meting;
import model.MultiMeting;
import model.SingleMeting;

public class MeetstationLauncher {

	public static void main(String[] args) {
		System.out.println("Dit is het tentamen OOP1 van Coco Huissoon 500603152");
		Meting single= new SingleMeting(5.5,"Het is veeel te heet","Coco");
		System.out.println(single);
		double[]arr={2.5,5.5,5.7};
		Meting multi = new MultiMeting(arr,"Het is nog steeds veel te heet","Gerke");
		Meting plti = new MultiMeting(arr,"Het is nog steeds veel te heet","Gerke");
		System.out.println(multi);
		MeetStation meet=new MeetStation("De temperaturen voor vandaag");
		meet.voegmetingToe(single);
		meet.voegmetingToe(multi);
		meet.voegmetingToe(plti);
		meet.toonRapport();
		
		

	}

}
