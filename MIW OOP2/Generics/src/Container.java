import java.util.ArrayList;

public class Container<T extends Klant> {
	private ArrayList<T> klanten= new ArrayList();

	public void add(T klant) {
		klanten.add(klant);
	}
	public Klant get(int klant) {
		return klanten.get(klant);
	}
	

}
