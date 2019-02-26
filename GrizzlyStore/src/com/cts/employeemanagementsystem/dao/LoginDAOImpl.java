package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employeemanagementsystem.utils.DBUtils;

public class LoginDAOImpl implements LoginDAO {
private static LoginDAOImpl loginDAOImpl = null;
public static LoginDAOImpl getInstance(){
	if(loginDAOImpl == null){
		loginDAOImpl = new LoginDAOImpl();
		return loginDAOImpl;
	}
	else
	{
		return loginDAOImpl;
	}
}
	public int getUserStatus(String id) {
		String query = "select * from login where user_id = ?";
		
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultset = preparedStatement.executeQuery();
			if(resultset.next()){
				return resultset.getInt("user_status");// TODO Auto-generated method stub
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return -1;
	}

	public String getUserType(String id) {
		String query = "select user_type from login where user_id = ?";
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			//System.out.println("2");
			resultset = preparedStatement.executeQuery();
			if(resultset.next()){
				return resultset.getString("user_type"); //TODO Auto-generated method stub
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;// TODO Auto-generated method stub
	
	}

	public boolean authenticateUser(String username, String password) {
		// TODO Auto-generated method stub
		
		String query = "select * from login where user_id = ? and pswd = ? ";
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			//System.out.println("qwersdfg");
			resultset = preparedStatement.executeQuery();
			//System.out.println("ac");
			if(resultset.next()){
				return true;// TODO Auto-generated method stub
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;// TODO Auto-generated method stub
	
	}
	

}
