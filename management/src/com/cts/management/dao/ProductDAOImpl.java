package com.cts.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.management.bean.Product;
import com.cts.management.utils.DBUtils;

public class ProductDAOImpl implements ProductDAO {
	
	private static ProductDAOImpl productDAOImpl;
	public static ProductDAOImpl getInstance(){
		if(productDAOImpl == null){
			productDAOImpl = new ProductDAOImpl();
			return productDAOImpl;
		}
		else
		{
			return productDAOImpl;
		}
	}
	
	private ProductDAOImpl(){}
	


	
	public String addProduct(Product product) {
		
		String query = "insert into addproducts values(?, ?, ?, ?, ?)";
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DBUtils.getConnection();
		try
		{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getCategory());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setFloat(5, product.getPrice());
			resultset = preparedStatement.executeQuery();
			
			}
		
		catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	

}
