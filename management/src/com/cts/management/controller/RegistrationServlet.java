package com.cts.management.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.management.service.EmployeeService;
import com.cts.management.service.EmployeeServiceImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		EmployeeService employeeService= new EmployeeServiceImpl();
		String userId= request.getParameter("userId");
		String password= request.getParameter("password");
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String userstatus= request.getParameter("userstatus");
		String usertype= request.getParameter("usertype");
		
		employeeService.addrecord(userId, password, fname, lname, userstatus, usertype);
		doGet(request,response);
		System.out.println("^^");
		
		
	}

}
