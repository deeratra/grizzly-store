package com.cts.employeemanagementsystem.bean;

public class Employee {
	
	private String empId;
	private static Employee employee;
	public static Employee getInstance(){
		if(employee == null)
		{
			employee = new Employee();
			return employee;
		}
		else
			return employee;
	}
//	private String firstName;
//	private String lastName;
//	private float salary;
//	public String getEmpId() {
//		return employeeId;
//	}
//	public void setEmployeeId(String employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
	private Employee() {
		//super();
	}
//	public Employee(String employeeId, String firstName, String lastName, float salary) {
//		super();
//		this.employeeId = employeeId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.salary = salary;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public float getSalary() {
//		return salary;
//	}
//	public void setSalary(float salary) {
//		this.salary = salary;
//	}

}
