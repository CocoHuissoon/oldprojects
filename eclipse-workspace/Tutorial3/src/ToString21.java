class Frog {
	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return String.format("%-3d: %s", id, name);
		/*StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(":  ");
		sb.append(name);
		return sb.toString();
	*/}
}

public class ToString21 {
	public static void main(String[] args) {
		Frog frog1 = new Frog(12, "Bertie");
		Frog frog2 = new Frog(666, "Satan");
		System.out.println(frog1);
		System.out.println(frog2);

		System.out.println();

	}

}
