package com.cts.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.employeemanagementsystem.bean.Employee;
import com.cts.employeemanagementsystem.utils.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static EmployeeDAOImpl employeeDAOImpl = null;
	public static EmployeeDAOImpl getInstance(){
		if(employeeDAOImpl == null){
			employeeDAOImpl = new EmployeeDAOImpl();
			return employeeDAOImpl;
		}
		else
		{
			return employeeDAOImpl;
		}
	}
	public void addRecord(String userId, String password, String userType, String phone, String address) {
		String query = " insert into login(user_id, pswd, user_type, phone, address) values (?, ?, ?, ?, ?) ";
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, userType);
			preparedStatement.setString(4, phone);
			preparedStatement.setString(5, address);
			resultset = preparedStatement.executeQuery();
//			while(resultset.next()){
//			 resultset.getInt("user_status");// TODO Auto-generated method stub
//			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
//	public void addRecord(String userId, String password, String user_type, int user_status) {
//		// TODO Auto-generated method stub
//		
//	}
	public void deleteRecord(String id) {
		String query = "delete from login where user_id = ?";
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultset = preparedStatement.executeQuery();
//			while(resultset.next()){
//			 resultset.getInt("user_status");// TODO Auto-generated method stub
//			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	}

//	public String userId(String id) {
//		String query = ""// TODO Auto-generated method stub
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

	
	}
	
	/*public String addEmployee(Employee employee) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		String insertStatement = "insert into employee " + "values(?,?,?,?)";
		connection = DBUtils.getConnection();
		try{
			
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setFloat(4, employee.getSalary());
			
			int res = preparedStatement.executeUpdate();
			return "success";
		}
		catch(SQLException e) {
			e.printStackTrace();
			try{
				connection.rollback();
				
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			return "fail";
		}
	
// TODO Auto-generated method stub
	}

	public String updateEmployee(String id, Employee employee) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		String insertStatement = "update employee set id=?, fname=?, lname=?, salary=?"
		+"where id= ?";
		connection = DBUtils.getConnection();
		try{
			
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setFloat(4, employee.getSalary());
			preparedStatement.setString(5, id);

			int res = preparedStatement.executeUpdate();
			return "success";
		}
		catch(SQLException e) {
			e.printStackTrace();
			try{
				connection.rollback();
				
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			return "fail";
		}
	// TODO Auto-generated method stub
	}

	public String deleteEmployee(String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		String insertStatement = "delete from employee where id=?";
		connection = DBUtils.getConnection();
		try{
			
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, id);
			
			int res = preparedStatement.executeUpdate();
			return "success";
		}
		catch(SQLException e) {
			e.printStackTrace();
			try{
				connection.rollback();
				
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			return "fail";
		}
		// TODO Auto-generated method stub

	}

	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		String query = " select * from employee where id = ? ";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		//ArrayList<Employee> employees = new ArrayList<>();
		
		try{
			connection = DBUtils.getConnection();
			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				String firstName= resultSet.getString("fname");
				float salary = resultSet.getFloat("salary");
				Employee employee = new Employee(id,firstName,"",salary);
				//employees.add(employee);
			}
			//return employees;
			else
			{
				return null;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return null;
	}

	public List<Employee> getEmployeesByName(String name) {
		
		String query = " select * from employee where fname = ? ";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<Employee> employees = new ArrayList<>();
		
		try{
			connection = DBUtils.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				String firstName= resultSet.getString("fname");
				String id= resultSet.getString("id");

				float salary = resultSet.getFloat("salary");
				Employee employee = new Employee(id,firstName,"",salary);
				employees.add(employee);
			}
			
//			else
//			{
//				return null;
//			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return employees;// TODO Auto-generated method stub
	
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		String query = " select * from employee ";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<Employee> employees = new ArrayList<>();
		
		try{
			connection = DBUtils.getConnection();
			preparedStatement = connection.prepareStatement(query);
			//preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				String firstName= resultSet.getString("fname");
				String id= resultSet.getString("id");

				float salary = resultSet.getFloat("salary");
				Employee employee = new Employee(id,firstName,"",salary);
				employees.add(employee);
			}
			
//			else
//			{
//				return null;
//			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return employees;// TODO Auto-generated method stub
	}

}
*/