package com.bridgelabz.savingaccount;

public class SavingsAccount {

	/* static variables */
	static double annualInterestRate = 4.5;

	/* instance variables */
	private double savingsBalance;

	/* Constructors */
	public SavingsAccount() {
	}

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	/* Methods */
	public double calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		this.savingsBalance += monthlyInterest;
		return monthlyInterest;

	}

	public static void modifyInterestRate(double newAnnualInterestRate) {

		annualInterestRate = newAnnualInterestRate;
	}

	/* Getters and setters */

	/**
	 * @return the savingsBalance
	 */
	public double getSavingsBalance() {
		return savingsBalance;
	}

	/**
	 * @param savingsBalance the savingsBalance to set
	 */
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	/**
	 * @return the annualInterestRate
	 */
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

}
