package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

@WebServlet("/karanhacker")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	private final static String saveDate="insert into user(email,psw,psw_repeat) values (?,?,?)";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("msg3","Registration Successfully !!!!");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/jsp");
		
		 String s1=request.getParameter("email");
		 String s2=request.getParameter("psw");
		 String s3=request.getParameter("psw_repeat");
		// System.out.println("Email_id ="+s1);
		// System.out.println("Password ="+s2);
	    //System.out.println("Repeat-password ="+s3);
	
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			 e.printStackTrace();
			 }
		 try 
			(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/z1","root","koot");
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(saveDate);){
			 
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			int count = ps.executeUpdate();
			if(count==0)
			{
				pw.println("Record not store");
				
			}
			else {
				pw.println("Record store");
			}
		} catch (SQLException se) {
			pw.println(se.getMessage());
			se.printStackTrace();
		} catch(Exception e1) {
			//pw.println(e1.getMessage());
			e1 .printStackTrace();
		}
		response.getWriter().append("Registration Sucessfully !!");
		 RequestDispatcher rd = request.getRequestDispatcher("Login2.jsp");
		rd.forward(request, response);
	pw.close();
	}
	
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
	}

}
