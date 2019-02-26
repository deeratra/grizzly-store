package com.cts.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.management.utils.DBUtils;

public class LoginDAOImpl implements LoginDAO {
private static LoginDAOImpl loginDAOImpl;
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
		String query = "select status from login where userid = ?";
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
				return resultset.getInt("status");// TODO Auto-generated method stub
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return -1;
	}

	public String getUserType(String id) {
		String query = "select user_type from login where userid = ?";
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
				return resultset.getString("user_type");// TODO Auto-generated method stub
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;// TODO Auto-generated method stub
	
	}

	public boolean authenticateUser(String username, String password) {
		// TODO Auto-generated method stub
		String query = "select * from login where user_id=? and password=?";
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			resultset = preparedStatement.executeQuery();
			
			System.out.println("ys");
			if(resultset.next()){
				System.out.println("yess");
				return true;// TODO Auto-generated method stub
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;// TODO Auto-generated method stub
	
	}
	
}
