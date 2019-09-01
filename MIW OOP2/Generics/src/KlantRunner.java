
public class KlantRunner {

	public static void main(String[] args) {
		Container <Klant> kc= new Container<Klant>();
		Klant K=new Klant("eeee", 0, 0, "eeeee");
		kc.add((Klant) K);
		
		System.out.println(kc.get(0).toString());

	}

}
