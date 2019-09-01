
public class ItalianPizzaFactory implements AbstractPizzaFactory{

	@Override
	public AbstractCheese createCheese() {
		// TODO Auto-generated method stub
		return new Mozarella();
	}

	@Override
	public AbstractSauce createSauce() {
		// TODO Auto-generated method stub
		return new ThinSauce();
	}



}
