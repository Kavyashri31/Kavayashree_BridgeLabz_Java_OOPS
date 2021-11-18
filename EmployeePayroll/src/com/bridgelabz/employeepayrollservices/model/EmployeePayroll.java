package com.bridgelabz.employeepayrollservices.model;

import java.util.Date;

public class EmployeePayroll {

	private int id;
	private String name;
	private String phoneNumber;
	private String address;
	private String department;
	private Double basic_pay;
	private Double deductions;
	private Double taxable_pay;
	private Double tax;
	private Double net_pay;
	private Date start;

	/**
	 * 
	 */
	public EmployeePayroll() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param address
	 * @param department
	 * @param basic_pay
	 * @param deductions
	 * @param taxable_pay
	 * @param tax
	 * @param net_pay
	 * @param start
	 */
	public EmployeePayroll(int id, String name, String phoneNumber, String address, String department, Double basic_pay,
			Double deductions, Double taxable_pay, Double tax, Double net_pay, Date start) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.department = department;
		this.basic_pay = basic_pay;
		this.deductions = deductions;
		this.taxable_pay = taxable_pay;
		this.tax = tax;
		this.net_pay = net_pay;
		this.start = start;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the basic_pay
	 */
	public Double getBasic_pay() {
		return basic_pay;
	}

	/**
	 * @param basic_pay the basic_pay to set
	 */
	public void setBasic_pay(Double basic_pay) {
		this.basic_pay = basic_pay;
	}

	/**
	 * @return the deductions
	 */
	public Double getDeductions() {
		return deductions;
	}

	/**
	 * @param deductions the deductions to set
	 */
	public void setDeductions(Double deductions) {
		this.deductions = deductions;
	}

	/**
	 * @return the taxable_pay
	 */
	public Double getTaxable_pay() {
		return taxable_pay;
	}

	/**
	 * @param taxable_pay the taxable_pay to set
	 */
	public void setTaxable_pay(Double taxable_pay) {
		this.taxable_pay = taxable_pay;
	}

	/**
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}

	/**
	 * @return the net_pay
	 */
	public Double getNet_pay() {
		return net_pay;
	}

	/**
	 * @param net_pay the net_pay to set
	 */
	public void setNet_pay(Double net_pay) {
		this.net_pay = net_pay;
	}

	/**
	 * @return the start
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeePayroll [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", department=" + department + ", basic_pay=" + basic_pay + ", deductions=" + deductions
				+ ", taxable_pay=" + taxable_pay + ", tax=" + tax + ", net_pay=" + net_pay + ", start=" + start + "]";
	}

}
