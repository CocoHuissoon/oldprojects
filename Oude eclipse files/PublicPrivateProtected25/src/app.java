import world.Plant;
/*Privat: Alleen in dezelfde class te bereiken 
 *Public: Overal te bereiken
 *Protected: Alleen in subclasses te bereiken en zelfde package
 *Geen modifier: Alleen in zelfde package te bereiken
 */

public class app {
public static void main (String[]args) {
	Plant plant = new Plant();
	
	System.out.println("My name is: " +plant.name);
	System.out.println("My ID is: " + plant.ID);
	
	//Werkt niet want type is privat
	//System.out.println(plant.type);
	
	//Werkt niet meer want size is protected en in andere package
	//System.out.println(plant.size);
	//Werkt niet want App en Plant zitten in verschillende packages
	//System.out.println(plant.height);
}
}
