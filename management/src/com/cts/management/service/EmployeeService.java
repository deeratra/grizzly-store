package com.cts.management.service;

import java.util.List;

import com.cts.management.bean.Employee;

public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	public String updateEmployee(String id, Employee employee);
	public String deleteEmployee(String id);
	public Employee getEmployee(String id);
	public List<Employee> getEmployeesByName(String name);
	public List<Employee> getEmployees();
	public void addrecord(String userId, String password, String fname, String lname,String userstatus, String usertype);

}
