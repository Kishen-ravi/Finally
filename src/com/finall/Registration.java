package com.finall;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registration extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{ 

		res.setContentType("text/html"); 
		
		String Username=req.getParameter("name");
		String Email=req.getParameter("email");
		String Password=req.getParameter("password");


		RegistrationClass rr = new RegistrationClass();
		rr.setName(Username);
		rr.setEmail(Email);
		rr.setPassword(Password);

		PersistenceManager pm= PMF.get().getPersistenceManager();
		pm.makePersistent(rr);
		res.sendRedirect("Registration.jsp");

	}
}