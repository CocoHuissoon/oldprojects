package studentapp.models;

public class Student {
	private String voornaam;
	private String achternaam;
	private Adres adres;
	
	public Student(String voornaam, String achternaam, Adres adres) {
		this.voornaam=voornaam;
		this.achternaam=achternaam;
		this.adres=adres;
	}

    public String toString() {
        return String.format("%s %s - %s", voornaam,achternaam,adres);
    }

}
