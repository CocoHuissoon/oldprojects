package objectfilers;

import java.io.Serializable;

public class Object implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6841226910734504346L;
	private int kenmerk;
	private String naam;
	private double ietsanders;
	public Object(int kenmerk, String naam, double ietsanders) {
		
		this.kenmerk = kenmerk;
		this.naam = naam;
		this.ietsanders = ietsanders;
	}

	@Override
	public String toString() {
		return "Object [kenmerk=" + kenmerk + ", naam=" + naam + ", ietsanders=" + ietsanders + "]";
	}

}
