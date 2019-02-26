package com.cts.employeemanagementsystem.service;

import java.util.List;

import com.cts.employeemanagementsystem.bean.Employee;
import com.cts.employeemanagementsystem.dao.EmployeeDAO;
import com.cts.employeemanagementsystem.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeServiceImpl employeeserviceimpl = null;
	private EmployeeDAO dao= EmployeeDAOImpl.getInstance();
	public static EmployeeServiceImpl getInstance()
	{
		if(employeeserviceimpl == null)
		{
			employeeserviceimpl = new EmployeeServiceImpl();
			return employeeserviceimpl;
		}
		else
			return employeeserviceimpl;
	}
//	public String userId(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String password(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String userType(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public int userStatus(String id) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public List<Employee> getEmployeesByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<Employee> getEmployees() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public void addRecord(String userId, String password, String user_type, String phone, String address) {
		// TODO Auto-generated method stub
		 dao.addRecord(userId, password, user_type, phone, address);
	}
	public void deleteRecord(String id) {
		// TODO Auto-generated method stub
		dao.deleteRecord(id);
	}

	}
	/*
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(id,employee);
	}

	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployee(id);
	}

	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
	return null;	
	}

	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeesByName(name);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployees();
	}

}
*/