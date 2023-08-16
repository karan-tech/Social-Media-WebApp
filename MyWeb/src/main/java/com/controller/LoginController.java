 package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/loginpage")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //Default constructor
	//public LoginController() { }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("msg2","Invalid User !!");
		String un=request.getParameter("uname");
		String ps=request.getParameter("psw");
		
		System.out.println("Username = " +un);
		System.out.println("Password = " +ps);
		
		if("karan".equals(un) && "2022".equals(ps)||"anku".equals(un) && "2023".equals(ps)
				||"chikuuu".equals(un) && "2024".equals(ps)||"aasma".equals(un) && "2025".equals(ps)) {
			System.out.println("Login sucessfully");
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("Login failed");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		//response.getWriter().append("Login Sucessfully!!");
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("I am in dopost");
		doGet(request, response);
	}

}
