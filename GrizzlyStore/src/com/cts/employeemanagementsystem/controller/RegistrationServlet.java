package com.cts.employeemanagementsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employeemanagementsystem.service.EmployeeService;
import com.cts.employeemanagementsystem.service.EmployeeServiceImpl;
import com.cts.employeemanagementsystem.service.LoginService;
import com.cts.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	EmployeeService employeeService = EmployeeServiceImpl.getInstance();
	
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
		
		String empId = request.getParameter("empId");
		String password = request.getParameter("password");
		String user_type = request.getParameter("user_type");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		//int salary = Integer.parseInt(request.getParameter("salary"));
		employeeService.addRecord(empId, password, user_type, phone, address);
		//System.out.print(empId +" "+fname+" "+lname+" "+salary);// TODO Auto-generated method stub
		doGet(request, response);
	}

}
