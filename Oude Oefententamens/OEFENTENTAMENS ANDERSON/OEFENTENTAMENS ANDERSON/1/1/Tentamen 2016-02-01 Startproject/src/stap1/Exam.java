package stap1;

public class Exam extends Work {
	private String course;

	// Constructor
	public Exam(String course) {
		super();
		this.course = course;
	}

	@Override
	public void doIt() {
		System.out.printf("Taking the %s exam...", this.course);
	}

}
