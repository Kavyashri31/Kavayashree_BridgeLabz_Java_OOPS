package com.bridgelabz.employeewage;

import java.util.Arrays;
import java.util.List;

import com.bridgelabz.employeewage.model.Employee;

public class EmpWageUC1 {

	public EmpWageUC1() {
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("R2D2");
		Employee emp2 = new Employee("C3PO");
		Employee emp3 = new Employee("BB8");

		List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3);

		for (int i = 0; i < employeeList.size(); i++) {
			employeeList.get(i).getAttendance();

			String empAttendance = employeeList.get(i).isPresent() ? "present" : "absent";

			System.out.println(employeeList.get(i).getName() + " is " + empAttendance);

		}

	}
}
