package stap4;


import java.io.Serializable;


public class Dier implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2682957482774061744L;
	private String soort;
	private double gewicht;
	private int aaibaarheidsfactor;
	
	public Dier(String soort, double gewicht, int aaibaarheidsfactor) {
		super();
		this.soort = soort;
		this.gewicht = gewicht;
		this.aaibaarheidsfactor = aaibaarheidsfactor;
	}
	
	public String toString() {
		return "[ " + soort + ", " + gewicht + ", " + aaibaarheidsfactor + "]";
	}
	
	
}
