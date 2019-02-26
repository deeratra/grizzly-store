package com.cts.grizzlystore.service;
import java.util.List;

import com.cts.grizzlystore.bean.Employee;

public interface EmployeeService {
	
	public void addRecord(String userId, String password, String user_type, String phone, String address);
	public void deleteRecord(String id);

}
