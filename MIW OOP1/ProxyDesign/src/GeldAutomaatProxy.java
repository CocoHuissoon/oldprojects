
public class GeldAutomaatProxy implements GetGeldAutomaatData {

	// Allows the user to access getATMState in the 
	// Object ATMMachine
	
	public GeldAutomaatStatus GetGeldAu() {
		
		Geldautomaat echteGeldAutomaat = new Geldautomaat();
		
		return echteGeldAutomaat.getGeldautomaatStatus();
	}

	// Allows the user to access getCashInMachine 
	// in the Object ATMMachine
	
	public int getCashInMachine() {
		
		Geldautomaat echteGeldAutomaat = new Geldautomaat();
		
		return echteGeldAutomaat.getGeldInAutomaat();
		
	}

	@Override
	public GeldAutomaatStatus GetGeldAutomaatStatus() {
		
		return null;
	}

	@Override
	public int getGeldInmachine() {
		
		return 0;
	}
	
}
