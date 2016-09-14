package com.finall;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.jdo.Query;

public class GetitServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{ 

res.setContentType("text/html"); 
PrintWriter pw=res.getWriter(); 

String Email=req.getParameter("email");
String Password=req.getParameter("password");

PersistenceManager pm= PMF.get().getPersistenceManager();
Query q = pm.newQuery(RegistrationClass.class,"Email == '"+Email+"' && Password == '"+Password+"'"); 
List<RegistrationClass> lst = (List<RegistrationClass>)q.execute();

if(!lst.isEmpty()){
	for(RegistrationClass sp : lst)
	{

	String name=(String)sp.getName();
	pw.println("<h1>" + name + "</h1");
	
RequestDispatcher rd = req.getRequestDispatcher("home.html");
rd.forward(req,res);
}}
else{
pw.print("Sorry UserName or Password Error!"); 
RequestDispatcher rd=req.getRequestDispatcher("Login.html"); 
rd.include(req, res); 
}
}
}
