package studentapp.models;

public class Groep {
	private String naam;
	private static int aantalStudenten;
	Student studentlijst[] = new Student[30];

	public Groep(String naam) {
		this.naam = naam;
		this.aantalStudenten = 0;
		this.studentlijst = studentlijst;
	}

	public boolean voegStudentToe(Student student) {
		boolean voegStudentToe;
		if (aantalStudenten < 31) {
			studentlijst[aantalStudenten] = student;
			aantalStudenten++;
			voegStudentToe = true;
		} else {
			voegStudentToe = false;
		}
		return voegStudentToe;
	}

	public String toString() {
		String result= String.format("Groep %s heeft %d\n", naam, aantalStudenten);
		for(int i=0;i<=aantalStudenten;i++) {
			result+=String.format("%s\n", studentlijst[i]);
		}
		return result;
	}
	

}
