package com.cts.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.employeemanagementsystem.service.LoginService;
import com.cts.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher requestDispatcher = null;
    /**
     * Default constructor. 
     */
    public LoginServlet(){
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
		
		LoginService loginService = LoginServiceImpl.getInstance();
				
		HttpSession session = null;
		String userId = request.getParameter("username");
		String password = request.getParameter("password");
		//boolean auth=false;
		
//		int userStatus = loginService.getUserStatus(userId);
//		auth=loginService.authenticateUser(userId, password);
//		System.out.println(userStatus);
//		System.out.println(auth);
		
		//System.out.print(userId+ " "+ password);
		// TODO Auto-generated method stub
	
	if(loginService.authenticateUser(userId, password) )
	{			//response.sendRedirect("admin.html");
		//userStatus = loginService.getUserStatus(userId);
		String authorization = loginService.authorization(userId);
		int userStatus = loginService.getUserStatus(userId);
		//System.out.println(userStatus);
		if("A".equals(authorization))
		{
			if(userStatus == 0)
			{
				session = request.getSession();
				session.setAttribute("username", userId);
				//System.out.println("A and 0");
				requestDispatcher = request.getRequestDispatcher("view-product.jsp");
				requestDispatcher.forward(request,response);
			}
			else
				if(userStatus == 1)
				{
					System.out.print("Already logged-in");
				}
				else
					if(userStatus == 2)
					{
						requestDispatcher = request.getRequestDispatcher("deactivatedAccount.html");
						requestDispatcher.forward(request,response);
					}
		}
		else
			if("V".equals(authorization))
			{
				if(userStatus == 0)
				{
					requestDispatcher = request.getRequestDispatcher("view product.html");
					requestDispatcher.forward(request,response);
				}
				else
					if(userStatus == 1)
					{
						System.out.print("Already logged-in");
					}
					else
						if(userStatus == 2)
						{
							requestDispatcher = request.getRequestDispatcher("deactivatedAccount.html");
							requestDispatcher.forward(request,response);
						}
			}
			else
				if("U".equals(authorization))
				{
					if(userStatus == 0)
					{
						requestDispatcher = request.getRequestDispatcher("view product.html");
						requestDispatcher.forward(request,response);
					}
					else
						if(userStatus == 1)
						{
							System.out.print("Already logged-in");
						}
						else
							if(userStatus == 2)
							{
								requestDispatcher = request.getRequestDispatcher("deactivatedAccount.html");
								requestDispatcher.forward(request,response);
							}
				}
				else
				{
					System.out.println("login failed, password/user id did not match...");
					requestDispatcher = request.getRequestDispatcher("index.html");
					requestDispatcher.forward(request,response);
				}
		
	}
		else
		{
			System.out.println("retry");
		}
//		else
//			System.out.println("login failed, password/user id did not match...");
//	requestDispatcher = request.getRequestDispatcher("index.html");
//	requestDispatcher.forward(request,response);
		//doGet(request, response);
	}

}
