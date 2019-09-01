
public class AmericanPizzaFactory implements AbstractPizzaFactory{

	@Override
	public AbstractCheese createCheese() {
		
		return new Cheddar();
	}

	@Override
	public AbstractSauce createSauce() {
		// TODO Auto-generated method stub
		return new ThickSauce();
	}



}
