package exceptions;

public class WithdrawLimitExceededException extends Exception{
	
	public WithdrawLimitExceededException() {
		super("The amount can not be negative or exceed the withdraw limit.");
    }

}
