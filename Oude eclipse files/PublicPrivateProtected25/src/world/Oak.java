package world;

public class Oak extends Plant{
	public Oak() {
		
		//Werk niet want type variabele is private
		this.type="tree";
		//Werkt want Oak is een subclass van Plant
		this.size="Huge";
		//Werkt want height heeft geen acces specifier en Oak en Plant zitten in zelfde package
		this.height=2;
				
	}

}
