package com.cts.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.management.bean.Employee;
import com.cts.management.utils.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {

	public String addEmployee(Employee employee) {
		
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

	
	public void addrecord(String userId, String password, String fname, String lname, String userstatus,
			String usertype) {
		// TODO Auto-generated method stub
		String query = "insert into login values(?, ?, ?, ?, ?, ?) ";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try{
			connection = DBUtils.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, fname);
			preparedStatement.setString(4, lname);
			preparedStatement.setString(5, userstatus);
			preparedStatement.setString(6, usertype);
			
			resultSet = preparedStatement.executeQuery();
			
			
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
		//return employees;// TODO Auto-generated method stub
	}
		
		
		
	}


