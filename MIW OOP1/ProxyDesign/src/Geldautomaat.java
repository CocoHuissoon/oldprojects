
public class Geldautomaat implements GetGeldAutomaatData {
		
		
		public Geldautomaat getKaartTerug() { return heeftKaart; }
		public Geldautomaat getKaartNietTerug() { return geenKaart; }
		public Geldautomaat getHeeftPin() { return heeftJuistePin; }
		public Geldautomaat getGeenGeld() { return geldAutomaatLeeg; }
		
		
		public Geldautomaat getGeldautomaatStatus() { return getGeldautomaatStatus(); }
		public int getGeldInAutomaat() { return cashInMachine; }
		@Override
		public GeldAutomaatStatus GetGeldAutomaatStatus() {
			
		}
		@Override
		public int getGeldInmachine() {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
