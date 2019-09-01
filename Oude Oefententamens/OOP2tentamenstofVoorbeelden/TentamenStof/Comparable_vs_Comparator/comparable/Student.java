package comparable;

//Example, natural order sorts alphabetically on name
import java.lang.Comparable;

public class Student implements Comparable<Student> {
	String name;
	int studnr;

	Student(String n, int i) {
		name = n;
		studnr = i;
	}

	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

	public String toString() {
		return String.format("Student: (%s,%d)", name, studnr);
	}

}