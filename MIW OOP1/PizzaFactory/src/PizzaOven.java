
public class PizzaOven {
	
	public static void main(String[]args) {
		AbstractPizzaFactory newYork= new AmericanPizzaFactory();
		AbstractPizzaFactory napoli = new ItalianPizzaFactory();
		System.out.println(napoli.createCheese().smell());
		
		
		
	}
//	public static AbstractPizzaFactory createAmericanPizza() {
//		return new AmericanPizzaFactory();
//	}
//	public static AbstractPizzaFactory createItalianPizza() {
//		return new ItalianPizzaFactory();
//	}

}
