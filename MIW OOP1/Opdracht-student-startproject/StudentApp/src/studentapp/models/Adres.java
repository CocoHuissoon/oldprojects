package studentapp.models;


public class Adres {
	
	private String straat;
	private int huisNr;
	private String plaats;
	
	public Adres(String straat,int huisNr,String plaats) {
		this.straat=straat;
		this.huisNr=huisNr;
		this.plaats=plaats;
	}
	public Adres() {
		this("",0,"");
	}

    public String toString() {
        return String.format("%s %d, %s", this.straat,this.huisNr,this.plaats);
    }
    
}
