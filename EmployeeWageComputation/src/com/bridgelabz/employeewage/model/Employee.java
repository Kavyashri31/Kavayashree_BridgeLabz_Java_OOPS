package com.bridgelabz.employeewage.model;

public class Employee {

	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 30;
	public static final int MAX_HRS_IN_MONTH = 100;

	public Employee() {
	}

	public Employee(String name) {
		super();
		this.name = name;
		// this.isPresent = isPresent;
	}

	private String name;
	private boolean isPresent;
	private int empHrs;
	private int totalEmpWage;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isPresent
	 */
	public boolean isPresent() {
		return isPresent;
	}

	/**
	 * Method to set the value for isPresent
	 * 
	 * @param isPresent the isPresent to set
	 */
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	/**
	 * @return the empHrs
	 */
	public int getEmpHrs() {
		return empHrs;
	}

	/**
	 * @param empHrs the empHrs to set
	 */
	public void setEmpHrs(int empHrs) {
		this.empHrs = empHrs;
	}

	/**
	 * @return the totalEmpWage
	 */
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	/**
	 * @param totalEmpWage the totalEmpWage to set
	 */
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", isPresent=" + isPresent + "]";
	}

	public boolean getAttendance() {

		/*
		 * UC-2
		 * 
		 * double empCheck = Math.floor(Math.random() * 10) % 3;
		 */

		/*
		 * UC-3
		 * 
		 * if (empCheck == IS_FULL_TIME) { this.isPresent = true; this.empHrs = 8; }
		 * else if (empCheck == IS_PART_TIME) { this.isPresent = true; this.empHrs = 4;
		 * } else { this.isPresent = false; this.empHrs = 0; }
		 */

		/* UC-4 */

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {

		case IS_FULL_TIME:
			empHrs = 8;
			this.isPresent = true;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			this.isPresent = true;
			break;
		default:
			empHrs = 0;
			this.isPresent = false;
			break;

		}
		return this.isPresent;
	}

	public double getEmployeeWage() {
		return this.empHrs * EMP_RATE_PER_HOUR;

	}

	public double getTotalWage() {
		double totalWage = 0;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {

			double empWage = this.getEmployeeWage();
			totalWage += empWage;
		}
		return totalWage;
	}

	public double getTotalWageUC6() {
		double totalEmpWage = 0;
		int totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {

			totalWorkingDays++;

			double empWage = this.getEmployeeWage();
			totalEmpHrs += this.empHrs;
			totalEmpWage += empWage;

		}
		System.out.println("Total Emp Hrs:" + totalEmpHrs);
		System.out.println("Total Working days:" + totalWorkingDays);
		System.out.println("Total Emp Wage:" + totalEmpWage);
		return totalEmpWage;
	}
}
