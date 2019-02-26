package com.cts.management.service;

import java.util.List;

import com.cts.management.bean.Employee;
import com.cts.management.dao.EmployeeDAO;
import com.cts.management.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	public String addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);
		//return null;
	}

	
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(id,employee);
	}

	
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addrecord(String userId, String password, String fname, String lname,String userstatus, String usertype)
	{
		employeeDAO.addrecord(userId, password, fname, lname, userstatus, usertype);
		
	}

	
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
