package com.bridgelabz.employeewage;

import java.util.Arrays;
import java.util.List;

import com.bridgelabz.employeewage.model.Employee;

public class EmpWageUC3 {

	public EmpWageUC3() {
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("R2D2");
		Employee emp2 = new Employee("C3PO");
		Employee emp3 = new Employee("BB8");

		List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3);

		for (int i = 0; i < employeeList.size(); i++) {

			Employee emp = employeeList.get(i);

			emp.getAttendance();
			String empAttendance = emp.isPresent() ? "present" : "absent";
			System.out.println(emp.getName() + " is " + empAttendance);

			double empWage = emp.getEmployeeWage();
			System.out.println("Emp Wage:" + empWage);

		}
	}
}
