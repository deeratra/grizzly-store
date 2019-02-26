package com.cts.grizzlystore.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.grizzlystore.bean.*;
import com.cts.grizzlystore.dao.ProductDAO;
import com.cts.grizzlystore.dao.ProductDAOImpl;
import com.cts.grizzlystore.utils.DBUtils;

public class ProductDAOImpl implements ProductDAO {
Connection connection =null;
	//ProductDAO dao = new ProductDAOImpl();
	public String addProduct(Product product) {
		
		String query ="insert into products values(?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		connection = DBUtils.getConnection();
		
		try {
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,product.getId());
			preparedStatement.setString(2, product.getCategory());
			preparedStatement.setString(3, product.getName());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setFloat(5, product.getPrice());
			
			preparedStatement.executeUpdate();
			return "success";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(connection);
		}
		return "failed";
		
		
		
		
	}
	

}
