package main;

import java.math.BigDecimal;

import exceptions.*;
import model.BankAccount;

public class BankAccountLauncher {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(new BigDecimal("1000.0"), new BigDecimal("2500.0"), new BigDecimal("0.0"));
		System.out.println(bankAccount.getBalance());
		bankAccount.deposit(new BigDecimal("1000.0"));
		System.out.println(bankAccount.getBalance());
		
		try {
			bankAccount.withDraw(new BigDecimal("2300.0"));
			System.out.println(bankAccount.getBalance());
		} catch (WithdrawNegativeException e) {
			e.printStackTrace();
		} catch (WithdrawLimitExceededException e) {
			e.printStackTrace();
		} catch (OverdrawLimitExceededException e) {
			e.printStackTrace();
		} catch (NoOverdrawException e) {
			e.printStackTrace();
		}
		
		System.out.println(bankAccount.getBalance());
		bankAccount.setOverdrawLimit(new BigDecimal("-500.0"));
		
		try {
			bankAccount.withDraw(new BigDecimal("2500.0"));
			System.out.println(bankAccount.getBalance());
		} catch (WithdrawNegativeException e) {
			e.printStackTrace();
		} catch (WithdrawLimitExceededException e) {
			e.printStackTrace();
		} catch (OverdrawLimitExceededException e) {
			e.printStackTrace();
		} catch (NoOverdrawException e) {
			e.printStackTrace();
		}
		
		System.out.println(bankAccount.getBalance());
		
	}

}
