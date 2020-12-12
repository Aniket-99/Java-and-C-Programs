package com.labexercise.inheritance;

public class Account {
	static long accNum = 10000;
	private double balance;
	Person accHolder;

	public Account() {

	}

	public Account(Person accHolder, double balance) {
		if(balance < 500) {
			System.out.println("You need more than 500 for creating an account!!");
			return;
		}
		accNum++;
		this.accHolder = accHolder;
		this.balance = balance;
		System.out.println(accHolder.getName()+" account created with initial balance "+this.balance);
		System.out.println(accHolder.getName()+" your account number is: "+accNum);
	}

	public void deposit(double amount) {
		 if (amount > 0.0) {
			 balance = balance + amount;
		 }
		 //display();
	}

	public void withDraw(double amount) {
		balance = balance - amount;
		//display();
	}
	
	public void display() {
		System.out.println("Account Number: "+getAccNum());
		System.out.println("Account Holder name: "+accHolder.getName());
		System.out.println("Current Balance is: "+getBalance());
	}
	
	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
