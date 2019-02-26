package com.cts.employeemanagementsystem.dao;

public interface LoginDAO {
	
	public int getUserStatus(String id) ;
	public String getUserType(String id);
	public boolean authenticateUser(String username, String password);
	
}
