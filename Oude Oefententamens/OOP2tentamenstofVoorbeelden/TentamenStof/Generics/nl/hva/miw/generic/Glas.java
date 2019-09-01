package nl.hva.miw.generic;

/**
 * 
 * @author michel.mercera
 *
 * @param <A> generieke type, een concreet object van Glas moet een concreet type A hebben.
 * @param <B> generieke type, een concreet object van Glas moet een concreet type A hebben.
 */
public class Glas<A, B> {

	private A fris;
	private B alcohol;
	
	public Glas(){
		
	}
	public Glas(A fris, B alcohol){
		this.fris = fris;
		this.alcohol = alcohol;
	}
	public A getFris() {
		return fris;
	}
	public void setBase(A fris) {
		this.fris = fris;
	}
	public B getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(B alcohol) {
		this.alcohol = alcohol;
	}
	
	public String shake(){
		return this.fris + " "+this.alcohol;
	}
	
}
