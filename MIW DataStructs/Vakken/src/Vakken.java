import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Vakken  {
	private HashMap<String,Integer> vakken;
	private String vakcode;
	private int ects;
	
	public Vakken(String url) {
		super();
		this.vakken=vulVakken(url);
	}
	public HashMap<String, Integer> getVakken() {
		return vakken;
	}
	public HashMap<String, Integer> vulVakken(String url) {
		HashMap<String,Integer> vakken=new HashMap<String,Integer> ();
		try (Scanner sc=new Scanner(new File(url))){
			
				while(sc.hasNext()) {
					vakcode=sc.next();
					ects=sc.nextInt();
					vakken.put(vakcode,ects );
					
				}
			
		} catch (FileNotFoundException e) {
			System.out.println("Kan file niet vinden" + e);
		}
		return vakken;
		
	}

	@Override
	public String toString() {
		return "Vakken [vakken=" + vakken + "]";
	}
	
	
	
	

}
