
public class Machine implements Info {
	private int id = 4;

	public void start() {
		System.out.println("Machine started");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine id is: " + id);

	}

}
