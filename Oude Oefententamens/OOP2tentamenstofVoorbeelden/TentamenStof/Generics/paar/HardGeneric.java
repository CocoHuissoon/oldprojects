package paar;

// Ensures that E is comparable, and then makes sure that this class itself is comparable
public class HardGeneric<E extends Comparable<E>> implements Comparable<HardGeneric<E>> {
	
	private E e;

	public HardGeneric(E e) {
		this.e = e;
	}
	
	
	@Override
	public int compareTo(HardGeneric<E> o) {
		
		return this.e.compareTo(o.e);
	}

}
