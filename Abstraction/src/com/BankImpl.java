package com;

public class BankImpl implements Bank {

	int balance = 5000;

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance = balance +amount;//balance += amount;
		System.out.println("Amount deposited sucessfully");

	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing Rs."+amount);
		balance -= amount;//balance = balance - amount;
		System.out.println("Amount withdrawn sucessfully");
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance : Rs."+balance);
	}

}
