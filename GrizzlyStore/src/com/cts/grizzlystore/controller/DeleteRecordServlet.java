package com.cts.grizzlystore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.grizzlystore.service.EmployeeService;
import com.cts.grizzlystore.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteRecordServlet
 */
public class DeleteRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	EmployeeService employeeService = EmployeeServiceImpl.getInstance();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRecordServlet() {
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
		employeeService.deleteRecord(empId);// TODO Auto-generated method stub
		doGet(request, response);
	}

}
