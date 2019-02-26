package com.cts.management.service;

public interface LoginService {

	public int getUserStatus(String id) ;
	public String getUserType(String id);
	public boolean authenticateUser(String username, String password);	
	public String authorization(String username);
	
}
