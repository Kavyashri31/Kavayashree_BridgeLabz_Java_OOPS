package com.bridgelabz.employeepayrollservices;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

import com.bridgelabz.employeepayrollservices.service.EmployeePayrollService;
import com.bridgelabz.employeepayrollservices.service.EmployeePayrollServiceImpl;

public class DBDemo {

	static EmployeePayrollService service = new EmployeePayrollServiceImpl();

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
		String username = "root";
		String password = "root";
		Connection con;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find the driver in classPath!", e);
		}

		listDrivers();

		try {
			System.out.println("Connecting to database:" + jdbcUrl);
			con = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection is successful!" + con);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(service.findAll());

		System.out.println(service.findById(5));

	}

	private static void listDrivers() {
		Enumeration<Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {

			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println("-> " + driverClass.getClass().getName());
		}

	}
}
