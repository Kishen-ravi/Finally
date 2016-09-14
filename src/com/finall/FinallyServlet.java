package com.finall;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FinallyServlet extends HttpServlet 
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String name=request.getParameter("username");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			PersistenceManager pm = PMF.get().getPersistenceManager();
			RegistrationClass rc= new RegistrationClass();
			
			rc.setName(name);
			rc.setEmail(email);
			rc.setPassword(password);
			
			pm.makePersistent(rc);
			response.sendRedirect("login.html");
			
			request.getRequestDispatcher("login.html").include(request, response);
			out.close();

		}
	}