package stap1;

public class Exam extends Work{
	private String course;
	public Exam(String course) {
		super();
		this.course = course;
	}
	@Override
	void doIt() {
		System.out.printf("Taking the %s exam…\n",this.course);
		
	}

}
