package com.cts.grizzlystore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.grizzlystore.bean.Product;
import com.cts.grizzlystore.service.ProductService;
import com.cts.grizzlystore.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String id= request.getParameter("productId");
		String category = request.getParameter("category");
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		float price = Float.parseFloat(request.getParameter("price"));
		
		ProductService productService = new ProductServiceImpl();
		
		Product product = new Product(id,category,name,description,price);
		
		String result = productService.addProduct(product);
		
		
		if("success".equals(result))
			response.sendRedirect("AddProduct.jsp");
		
			//System.out.println("Product Added Successfully");
		else
			System.out.println("Unable to Add Product");
	}

}
