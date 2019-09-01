package stap1;

public abstract class Work implements Repeatable{

	public abstract void doIt();
	
	@Override
	public void repeat(int times) {
		for (int i = 0; i < times; i++) {
			doIt();
		}
		
	}

}
