package exceptions;

public class NoOverdrawException extends Exception {

	public NoOverdrawException() {
		super("No overdraw possible");
	}

}
