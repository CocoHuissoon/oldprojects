package model;

import java.math.BigDecimal;

import exceptions.*;

public class BankAccount {
	private BigDecimal balance;
	private BigDecimal withdrawLimit;
	private BigDecimal overdrawLimit; // Moet een negatief getal zijn in dit geval
	private boolean overdraw;

	// All args Constructor
	public BankAccount(BigDecimal balance, BigDecimal withdrawLimit, BigDecimal overdrawLimit) {
		super();
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		this.overdrawLimit = overdrawLimit;
		if(overdrawLimit.compareTo(new BigDecimal("0.0")) < 0) {
			this.overdraw = true;
		} else {
			this.overdraw = false;
		}
	}

	// Constructor
	public BankAccount(BigDecimal balance) {
		this(balance, new BigDecimal("1000.0"), new BigDecimal("0.0"));
	}

	// No args Constructors
	public BankAccount() {
		this(new BigDecimal("0.0"));
	}

	// Deposit method
	public void deposit(BigDecimal amount) {
		if (amount.doubleValue() >= 0) {
			this.balance = this.balance.add(amount);
		}
	}

	// Withdraw method with exceptions
	public BigDecimal withDraw(BigDecimal amount) throws WithdrawNegativeException, WithdrawLimitExceededException, NoOverdrawException, OverdrawLimitExceededException {

		if ((amount.compareTo(withdrawLimit) <= 0) && ((balance.subtract(amount)).compareTo(overdrawLimit) >= 0)) {
			this.balance = balance.subtract(amount);
			return this.balance;
		} else if(amount.compareTo(new BigDecimal("0.0")) < 0) {
			throw new WithdrawNegativeException();
		} else if (amount.compareTo(withdrawLimit) > 0) {
			throw new WithdrawLimitExceededException();
		} else if(amount.compareTo(balance) > 0) {
			throw new NoOverdrawException();
		} else {
			throw new OverdrawLimitExceededException();
		}
	}

	// Setter for overdrawLimit
	public void setOverdrawLimit(BigDecimal overdrawLimit) {
		this.overdrawLimit = overdrawLimit;
	}

	// Getter for balance
	public BigDecimal getBalance() {
		return balance;
	}

	// Getter for overdraw
	public boolean isOverdraw() {
		return overdraw;
	}
	
	

}
