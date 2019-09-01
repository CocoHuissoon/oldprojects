package world;

public class Plant {
	
	
	// Slechte manier van werken
	public String name;
	
	//Goede manier van werken
	public static final int ID = 2;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Harpert";
		this.type ="plant";
		this.size= "Large";
		this.height=2000;
	}
	
	

}
