package com.bridgelabz.employeepayrollservices.service;

import java.util.List;

import com.bridgelabz.employeepayrollservices.model.EmployeePayroll;
import com.bridgelabz.employeepayrollservices.repository.EmployeePayrollRepository;
import com.bridgelabz.employeepayrollservices.repository.EmployeePayrollRepositoryImpl;

public class EmployeePayrollServiceImpl implements EmployeePayrollService {

	EmployeePayrollRepository repostitory = new EmployeePayrollRepositoryImpl();

	@Override
	public void addEmployeePayroll(EmployeePayroll employeePayroll) {
		repostitory.addEmployeePayroll(employeePayroll);
	}

	@Override
	public boolean updateEmployeePayroll(EmployeePayroll employeePayroll) {

		return repostitory.updateEmployeePayroll(employeePayroll);
	}

	@Override
	public boolean deleteEmployeePayroll(int id) {
		return repostitory.deleteEmployeePayroll(id);
	}

	@Override
	public EmployeePayroll findById(int id) {
		return repostitory.findById(id);
	}

	@Override
	public List<EmployeePayroll> findAll() {
		return repostitory.findAll();
	}

}
