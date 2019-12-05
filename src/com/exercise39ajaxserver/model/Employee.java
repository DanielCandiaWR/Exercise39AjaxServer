package com.exercise39ajaxserver.model;

public class Employee {
	private String nameEmployee;
	private double salaryEmployee;
	
	public Employee(){
		
	}
	
	public Employee(String nameEmployee, double salaryEmployee) {
		this.nameEmployee = nameEmployee;
		this.salaryEmployee = salaryEmployee;
	}
	
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getNameEmployee() {
		return this.nameEmployee;
	}
	
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	public double getSalaryEmployee() {
		return this.salaryEmployee;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.nameEmployee,this.salaryEmployee);
	}
}
