package com.exercise39ajaxserver.model;
import com.exercise39ajaxserver.model.Employee;
public class PayRoll {
	
	public static double CalculateSalary(Employee employee) {
		return employee.getSalaryEmployee() * 1.30;
	}
}
