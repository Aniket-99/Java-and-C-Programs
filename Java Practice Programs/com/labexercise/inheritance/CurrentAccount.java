package com.labexercise.inheritance;

public class CurrentAccount extends Account {
	
	int overDraftLimit = 3;
	Account personAccount;

	public CurrentAccount(Account personAccount) {
		super();
		this.personAccount = personAccount;
	}

	
	public CurrentAccount() {
		
	}
	
	public void withDraw(double minAmount) {
		overDraftLimit--;
		if(overDraftLimit < 0) {
			System.out.println("Maximum limit reached");
		}
		else {
			if (personAccount.getBalance() > 500) {
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
	
	
	
	
	
}
