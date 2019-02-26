package com.cts.management.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.management.service.LoginService;
import com.cts.management.service.LoginServiceImpl;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginService loginService = LoginServiceImpl.getInstance();
		
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("passsword");
		
		RequestDispatcher requestDispatcher;
		HttpSession session= null;
		//session= request.getSession();
		//session.setAttribute("username",userId);
		//System.out.print(userId+ " "+ password);
		// TODO Auto-generated method stub
	if(loginService.authenticateUser(userId, password))
	{			//response.sendRedirect("admin.html");
	
		String authorization = loginService.authorization(userId);
		int userStatus = loginService.getUserStatus(userId);
		
		if("A".equals(authorization))
		{
			if(userStatus == 0)
			{
				session= request.getSession();
				session.setAttribute("username", userId);
				
				requestDispatcher = request.getRequestDispatcher("product-list.html");
				requestDispatcher.forward(request, response);
			}
			else if(userStatus == 1)
			{
				System.out.println("Already Looged in");
				
			}
			
			else
			{
				requestDispatcher = request.getRequestDispatcher("deactivatedAccount");
				requestDispatcher.forward(request, response);
			}
		}
		
		else if("V".equals(authorization))
		{
			if(userStatus == 0)
			{
				session= request.getSession();
				session.setAttribute("username", userId);
				
				requestDispatcher = request.getRequestDispatcher("");
				requestDispatcher.forward(request, response);
			}
			else if(userStatus == 1)
			{
				System.out.println("Already Looged in");
				
			}
			
			else
			{
				requestDispatcher = request.getRequestDispatcher("deactivatedAccount");
				requestDispatcher.forward(request, response);
			}
		}
		
		else if("U".equals(authorization))
		{
			if(userStatus == 0)
			{
				session= request.getSession();
				session.setAttribute("username", userId);
				
				requestDispatcher = request.getRequestDispatcher("");
				requestDispatcher.forward(request, response);
			}
			else if(userStatus == 1)
			{
				System.out.println("Already Looged in");
				
			}
			
			else
			{
				requestDispatcher = request.getRequestDispatcher("deactivatedAccount");
				requestDispatcher.forward(request, response);
			}
		}
		
		
		
		
	}
		else
			System.out.println("login failed, password/user id did not match...");
	
	}

}
