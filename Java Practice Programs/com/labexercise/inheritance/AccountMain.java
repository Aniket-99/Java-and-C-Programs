package com.labexercise.inheritance;

public class AccountMain {

	public static void main(String[] args) {
		//Person smith = new Person("Smith", 20);
		Person kathy = new Person("Kathy", 26);
		
		//Account smithAccount = new Account(smith, 2000);
		Account kathyAccount = new Account(kathy, 3000);
		//smithAccount.deposit(2000);
		//System.out.println("The current balance of "+smith.getName()+" is: "+smithAccount.getBalance());
		System.out.println("the current balance of "+kathy.getName()+" is: "+kathyAccount.getBalance());
		//kathyAccount.withDraw(2000);
		//SavingsAccount kathyAcc = new SavingsAccount(kathyAccount);
		//kathyAcc.withDraw(200000);
		//Account kathysa = new SavingsAccount(kathyAccount);
		//kathysa.withDraw(500);
		CurrentAccount currentAccount = new CurrentAccount(kathyAccount);
		currentAccount.withDraw(20);
		currentAccount.withDraw(20);
		currentAccount.withDraw(20);
		currentAccount.withDraw(20);
		

	}

}
