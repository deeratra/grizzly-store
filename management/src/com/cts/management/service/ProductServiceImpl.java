package com.cts.management.service;

import com.cts.management.bean.Product;
import com.cts.management.dao.LoginDAO;
import com.cts.management.dao.LoginDAOImpl;
import com.cts.management.dao.ProductDAO;
import com.cts.management.dao.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {

	private static ProductServiceImpl productserviceimpl;
	private ProductDAO productDAO = ProductDAOImpl.getInstance();
	public static ProductServiceImpl getInstance(){
		if(productserviceimpl == null)
		{
			productserviceimpl = new ProductServiceImpl();
			return productserviceimpl;
		}
		else
		{
			return productserviceimpl;
		}
	}
	private ProductServiceImpl()
	{
		
	}
	
	public String addProduct(Product product) {
		
		return productDAO.addProduct(product);
		
	}
	
	

}
