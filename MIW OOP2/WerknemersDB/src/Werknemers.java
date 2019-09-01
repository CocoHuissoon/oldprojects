import java.io.Serializable;

public class Werknemers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6196268443175628430L;
	private int id;
	private String naam;
	private double salaris;
	
	public Werknemers(int id, String naam, double salaris) {
		super();
		this.id = id;
		this.naam = naam;
		this.salaris = salaris;
	}

	@Override
	public String toString() {
		return "Werknemers [id=" + id + ", naam=" + naam + ", salaris=" + salaris + "]";
	}
	
	

}
