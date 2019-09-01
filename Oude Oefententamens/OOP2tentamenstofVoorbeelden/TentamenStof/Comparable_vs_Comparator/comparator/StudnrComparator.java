package comparator;

//Comparator class, that compares Students based on studnr
import java.util.Comparator;
import java.io.Serializable;

public class StudnrComparator implements Comparator<Student>, Serializable {
	public int compare(Student s1, Student s2) {
		return s1.studnr - s2.studnr;
	}
}
