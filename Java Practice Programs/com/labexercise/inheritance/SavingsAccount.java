package com.labexercise.inheritance;

public class SavingsAccount extends Account {

	final double minimumBalance = 500;
	Account personAccount;

	public SavingsAccount(Account personAccount) {
		super();
		this.personAccount = personAccount;
	}

	public SavingsAccount() {
	}

	public void withDraw(double minAmount) {
		if (personAccount.getBalance() > minimumBalance) {
			double currentBalance = personAccount.getBalance();
			double remainingBalance = currentBalance - minAmount;
			if (remainingBalance < 0) {
				System.out.println("There is no sufficient balance left to withdraw!!");
			} else {
				personAccount.setBalance(remainingBalance);
				System.out.println("The remaining balance is: " + personAccount.getBalance());
			}

		}
	}

}
