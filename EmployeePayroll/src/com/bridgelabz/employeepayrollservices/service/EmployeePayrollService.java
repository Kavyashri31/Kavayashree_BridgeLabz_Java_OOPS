package com.bridgelabz.employeepayrollservices.service;

import java.util.List;

import com.bridgelabz.employeepayrollservices.model.EmployeePayroll;

public interface EmployeePayrollService {

	void addEmployeePayroll(EmployeePayroll employeePayroll);

	boolean updateEmployeePayroll(EmployeePayroll employeePayroll);

	boolean deleteEmployeePayroll(int id);

	EmployeePayroll findById(int id);

	List<EmployeePayroll> findAll();
}
