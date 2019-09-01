package nl.hva.miw.datastructures.studentmap;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	Map<Student, Double> map = new HashMap<Student, Double>();
	
	public void initializeMap() {
		// Create a few students
		Student s1 = new Student( "Jan de Boer", 1000);
		Student s2 = new Student( "Kees de Vries", 1001);
		Student s3 = new Student( "Piet Paulusma", 1002);
		Student s4 = new Student( "Anne Visser", 1003);
		Student s5 = new Student( "Susan Bronckhorst", 1004);
		
		map.put( s1,  9.1);
		map.put( s2,  8.0);
		map.put( s3,  6.1);
		map.put( s4,  9.6);
		map.put( s5,  7.8);
	}

	public Map<Student, Double> getMap() {
		return map;
	}
	
	/** More methods left out. Not relevant for assignment */

}