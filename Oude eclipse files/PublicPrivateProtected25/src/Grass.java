import world.Plant;

public class Grass extends Plant{
	public Grass() {
		//Werkt niet want height is niet in zelfde package als Grass ook al is Grass een subclass van Plant
		System.out.println(this.height);
	}

}
