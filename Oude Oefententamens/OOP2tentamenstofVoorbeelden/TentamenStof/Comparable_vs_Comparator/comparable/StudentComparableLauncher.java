package comparable;

//Natural order sort
import java.util.Arrays;

public class StudentComparableLauncher {

	public static void main(String[] args) {

		Student s1 = new Student("Sara", 1000);
		Student s2 = new Student("Anna", 2000);
		Student s3 = new Student("Peter", 1500);

		Student[] a = new Student[] { s1, s2, s3 };

		System.out.println(Arrays.toString(a));

		Arrays.sort(a); // Uses compareTo() of Student

		System.out.println(Arrays.toString(a));

	}

}
