import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudentResult {

	private HashMap<Integer, ArrayList<String>> students;
	private int studentID;
	private ArrayList<String> vakken;

	public StudentResult(HashMap<Integer, ArrayList<String>> students) {
		super();
		
	}

	public HashMap<Integer, ArrayList<String>>vulVakken(String url) {
		HashMap<Integer, ArrayList<String>> vakken=new HashMap ();
		try (Scanner sc=new Scanner(new File(url))){
			
				while(sc.hasNext()) {
					studentID=sc.nextInt();
					while(sc.)
					vakken=sc.nextInt();
					vakken.put(vakcode,ects );
					
				}
			
		} catch (FileNotFoundException e) {
			System.out.println("Kan file niet vinden" + e);
		}
		return vakken;
		
	}

	@Override
	public String toString() {
		return "StudentResult [students=" + students + "]";
	}

}
