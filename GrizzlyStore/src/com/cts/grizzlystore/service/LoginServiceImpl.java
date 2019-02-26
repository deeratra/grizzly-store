package com.cts.grizzlystore.service;

import com.cts.grizzlystore.dao.LoginDAO;
import com.cts.grizzlystore.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
private static LoginServiceImpl loginserviceimpl = null;
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
	public String authorization(String userName)
	{
		return dao.getUserType(userName);
		
	}

}
