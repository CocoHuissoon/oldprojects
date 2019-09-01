package paar;

// this basic class can handle whatever 2 types.
public class Paar<U, V> {

	private U type;
	private V value;

	public Paar(U type, V value) {
		this.type = type;
		this.value = value;
	}

	public boolean compareLength(U first, V second) {

		int U = first.toString().length();
		int V = second.toString().length();

		if (U == V) {
			return true;
		} else
			return false;
	}

	public U getType() {
		return type;
	}

	public V getValue() {
		return value;
	}
}
