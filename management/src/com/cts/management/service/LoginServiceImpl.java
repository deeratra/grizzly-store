package com.cts.management.service;

import com.cts.management.dao.LoginDAO;
import com.cts.management.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
private static LoginServiceImpl loginserviceimpl;
private LoginDAO dao = LoginDAOImpl.getInstance();
public static LoginServiceImpl getInstance(){
	if(loginserviceimpl == null)
	{
		loginserviceimpl = new LoginServiceImpl();
		return loginserviceimpl;
	}
	else
	{
		return loginserviceimpl;
	}
}
private LoginServiceImpl()
{
	
}
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}

	public boolean authenticateUser(String username, String password) {
		// TODO Auto-generated method stub
		return dao.authenticateUser(username, password);
	}
	
	public String authorization(String username) {
		// TODO Auto-generated method stub
		return dao.getUserType(username);
	}

}
