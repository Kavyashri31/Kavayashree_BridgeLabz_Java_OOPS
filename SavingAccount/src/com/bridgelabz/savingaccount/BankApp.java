package com.bridgelabz.savingaccount;

public class BankApp {

	public BankApp() {

	}

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);

		SavingsAccount.modifyInterestRate(4);

		double monthlyInterestSaver1 = saver1.calculateMonthlyInterest();
		double monthlyInterestSaver2 = saver2.calculateMonthlyInterest();

		System.out.println("Monthly Interest for Saver 1 account:" + monthlyInterestSaver1 + "|Balance:"
				+ saver1.getSavingsBalance());
		System.out.println("Monthly Interest for Saver 2 account:" + monthlyInterestSaver2 + "|Balance:"
				+ saver2.getSavingsBalance());

		SavingsAccount.modifyInterestRate(5);

		monthlyInterestSaver1 = saver1.calculateMonthlyInterest();
		monthlyInterestSaver2 = saver2.calculateMonthlyInterest();

		System.out.println("Monthly Interest for Saver 1 account:" + monthlyInterestSaver1 + "|Balance:"
				+ saver1.getSavingsBalance());
		System.out.println("Monthly Interest for Saver 2 account:" + monthlyInterestSaver2 + "|Balance:"
				+ saver2.getSavingsBalance());
	}

}
