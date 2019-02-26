package com.cts.grizzlystore.service;

import com.cts.grizzlystore.bean.Product;
import com.cts.grizzlystore.dao.ProductDAO;
import com.cts.grizzlystore.dao.ProductDAOImpl;
public class ProductServiceImpl implements ProductService {
	
	ProductDAO dao = new ProductDAOImpl();
	public String addProduct(Product product) {
		return dao.addProduct(product);// TODO Auto-generated method stub
	
	}

}
