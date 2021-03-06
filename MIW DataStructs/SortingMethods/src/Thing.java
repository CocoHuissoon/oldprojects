import java.util.Comparator;

public class Thing implements Comparable<Thing>, Comparator<Thing> {
	private int number;
	// private String name;
	private double salary;

	public int getNumber() {
		return number;
	}

	public double getSalary() {
		return salary;
	}

	public Thing(int number, double salary) {
		super();
		this.number = number;
		this.salary = salary;
	}

	public static Thing[] generateThings(int numberOfSThings) {
		Thing[] things = new Thing[numberOfSThings];
		for (int i = 0; i < numberOfSThings; i++) {
			things[i] = new Thing(((int) (Math.random() * 1000) + 1), (Math.random() * 1000) + 1);
		}
		return things;
	}

	@Override
	public int compare(Thing o1, Thing o2) {
		if (o1.getNumber() < o2.getNumber()) {
			return -1;
		}
		return 1;

	}

	@Override
	public int compareTo(Thing o) {
		if (this.getSalary() < o.getSalary())
			return -1;
		else if (o.getSalary() < this.getSalary())
			return 1;
		return compare(this, o);
	}

	@Override
	public String toString() {
		return String.format(" Number:%d Salary:%.2f", number, salary);
	}

}
