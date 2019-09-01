class Plant{
	public static final int ID=45;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		
		System.out.println(plant1.ID);
		
		

	}

}
