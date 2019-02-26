package com.cts.employeemanagementsystem.dao;

import java.util.List;

import com.cts.employeemanagementsystem.bean.Employee;

public interface EmployeeDAO {
	
	public void addRecord(String userId, String password, String user_type, String phone, String address);
	void deleteRecord(String id);
}
