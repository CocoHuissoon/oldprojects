package exceptions;

public class WithdrawNegativeException extends Exception{

	public WithdrawNegativeException() {
		super("Can't withdraw a negative amount.");
	}
	
}
