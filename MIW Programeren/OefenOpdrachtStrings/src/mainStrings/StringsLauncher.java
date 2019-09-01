package mainStrings;

public class StringsLauncher {

	public static void main(String[] args) {
		
		String zin= "Programming is leuk";
		String zin2o = "oefenen";
		String zin2i= "is";
		String zin2n="noodzakelijk";
				
		String arr[] = zin.split(" ", 2);
		String firstWord = arr[0];
		System.out.println("Geef een zin van 3 woorden: " +zin);
		System.out.println("Aantal karakters in de zin: "+ zin.length());
		System.out.println("De eerste letter van de zin: "+zin.charAt(0));
		System.out.println("Het eerste woord van de zin: "+ firstWord);
		System.out.println("De zin in hoofdletters: "+ zin.toUpperCase());
		System.out.println("Geef een tweede zin van 3 woorden: " + zin2o + " "+ zin2i+" "+zin2n);
		System.out.println("Aantal karakters in woord 1: " + zin2o.length());
		System.out.println("Aantal karakters in woord 2: "+ zin2i.length());
		System.out.println("Aantal karakters in woord 3: "+ zin2n.length());
		System.out.println("De eerste letter van woord 1: "+ zin2o.charAt(1));
		System.out.println("De eerste letter van woord 2: "+ zin2i.charAt(0));
		System.out.println("De eerste letter van woord 3: "+ zin2n.charAt(0));
		System.out.println("De zin in hoofdletters: "+ zin2o.toUpperCase()+" "+ zin2i.toUpperCase()+" "+zin2n.toUpperCase());
		
		String zin1Woord1= "Programming"
		
				;
	  /*Geef een zin van 3 woorden: Programming is leuk
		Aantal karakters in de zin: 19
		De eerste letter van de zin: P
		Het eerste woord van de zin: Programming
		De zin in hoofdletters: PROGRAMMING IS LEUK
		Geef een tweede zin van 3 woorden: oefenen is noodzakelijk
		Aantal karakters in woord 1: 7
		Aantal karakters in woord 2: 2
		Aantal karakters in woord 3: 12
		De eerste letter van woord 1: o
		De eerste letter van woord 2: i
		De eerste letter van woord 3: n
		De zin in hoofdletters: OEFENEN IS NOODZAKELIJK*/

	}

}
