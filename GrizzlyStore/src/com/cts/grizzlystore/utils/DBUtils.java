package com.cts.grizzlystore.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	public final static String URL= "jdbc:oracle:thin:@localhost:1521:XE";
	
	public final static String driverName= "oracle.jdbc.driver.OracleDriver";
	
	public static final String userName="XE";
	
	public static final String password="root";
	
	public static Connection getConnection(){
		
		Connection connection =null;
	try
	{
		
		Class.forName(driverName);
		connection = DriverManager.getConnection(URL, userName, password);
		return connection;
		
	}
	catch (ClassNotFoundException e){
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	return null;
	
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
