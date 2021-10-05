package com.bridgelabz.bankaccount;

public class Account {

	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account account1 = new Account(1000.0);
		Account account2 = new Account(2000.0);
		Account account3 = new Account(3000.0);

		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

		account1.debit(400);
		account2.debit(1000);
		account3.debit(500);

		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

	}

	public void debit(double amount) {

		if (amount > balance) {

			System.out.println("Debit amount exceeded account balance.");
		}

		else {
			this.balance = this.balance - amount;

		}
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
