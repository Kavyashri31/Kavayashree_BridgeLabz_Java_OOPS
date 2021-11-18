package com.bridgelabz.employeepayrollservices.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bridgelabz.employeepayrollservices.model.EmployeePayroll;

public class EmployeePayrollRepositoryImpl implements EmployeePayrollRepository {

	String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
	String username = "root";
	String password = "root";
	Connection con;

	static final String SELECT_ALL_QUERY = "SELECT * FROM employee_payroll ";
	static final String SELECT_BY_ID_QUERY = "SELECT * FROM employee_payroll WHERE id = ?";

	/**
	 * 
	 */
	public EmployeePayrollRepositoryImpl() {
		try {
			con = DriverManager.getConnection(jdbcUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addEmployeePayroll(EmployeePayroll employeePayroll) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateEmployeePayroll(EmployeePayroll employeePayroll) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeePayroll(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeePayroll findById(int id) {
		System.out.println("findById:" + con);
		EmployeePayroll employeePayroll = new EmployeePayroll();
		try (PreparedStatement statement = con.prepareStatement(SELECT_BY_ID_QUERY);) {
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();

			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name

				String name = rs.getString("name");
				String phone_number = rs.getString("phone_number");
				String address = rs.getString("address");
				String department = rs.getString("department");
				Double basic_pay = rs.getDouble("basic_pay");
				Double deductions = rs.getDouble("deductions");
				Double taxable_pay = rs.getDouble("taxable_pay");
				Double tax = rs.getDouble("tax");
				Double net_pay = rs.getDouble("net_pay");
				Date start = rs.getDate("start");

				employeePayroll.setId(id);
				employeePayroll.setName(name);
				employeePayroll.setPhoneNumber(phone_number);
				employeePayroll.setAddress(address);
				employeePayroll.setDepartment(department);
				employeePayroll.setBasic_pay(basic_pay);
				employeePayroll.setDeductions(deductions);
				employeePayroll.setTaxable_pay(taxable_pay);
				employeePayroll.setTax(tax);
				employeePayroll.setNet_pay(net_pay);
				employeePayroll.setStart(start);

			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeePayroll;
	}

	@Override
	public List<EmployeePayroll> findAll() {
		System.out.println("findAll:" + con);
		List<EmployeePayroll> employeePayRollList = new ArrayList<>();
		try (Statement stmt = con.createStatement();) {

			ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY);

			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String phone_number = rs.getString("phone_number");
				String address = rs.getString("address");
				String department = rs.getString("department");
				Double basic_pay = rs.getDouble("basic_pay");
				Double deductions = rs.getDouble("deductions");
				Double taxable_pay = rs.getDouble("taxable_pay");
				Double tax = rs.getDouble("tax");
				Double net_pay = rs.getDouble("net_pay");
				Date start = rs.getDate("start");
				employeePayRollList.add(new EmployeePayroll(id, name, phone_number, address, department, basic_pay,
						deductions, taxable_pay, tax, net_pay, start));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeePayRollList;
	}

}
