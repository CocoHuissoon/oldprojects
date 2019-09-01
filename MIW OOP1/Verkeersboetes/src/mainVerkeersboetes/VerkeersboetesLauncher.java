package mainVerkeersboetes;

public class VerkeersboetesLauncher extends VerkeersBoete  {

	public static void main(String[] args) {
		ParkeerBoete p= new ParkeerBoete ("Max", "FFFFFFFFFF",2);
		p.bepaalBedrag();
		System.out.println(p.toString());
		SnelheidsBoete s = new SnelheidsBoete("Markie Kwarkie","EEEEEEEE",101,90);
		s.bepaalBedrag();
		System.out.println(s.toString());
		System.out.println((int)s.getBedrag().equals(22));
		

	}

}
