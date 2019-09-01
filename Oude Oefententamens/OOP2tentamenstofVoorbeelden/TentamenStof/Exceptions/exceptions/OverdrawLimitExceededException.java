package exceptions;

public class OverdrawLimitExceededException extends Exception {

	public OverdrawLimitExceededException() {
		super("Withdrawing that amount would result in exceeding the overdraw limit.");
	}
	
}
