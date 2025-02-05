package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/task")
public class Task extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int x=Integer.parseInt(request.getParameter("t1"));
		int y=Integer.parseInt(request.getParameter("t2"));
		int z=0;
		String choice=request.getParameter("choice");
	    RequestDispatcher rd = request.getRequestDispatcher("/index2.html");
	    rd.include(request, response);
		switch (choice) 
		{
	        case "Add": z=x+y;
	                    out.println("<h1>Sum: " + z + "</h1>");
	                    break;
	                
	        case "Sub": z=x-y;
	                    out.println("<h1>Sub: " + z + "</h1>");
	                    break;
	                
	        case "Mul": z=x*y;
	                    out.println("<h1>Mul: " + z + "</h1>");
	                    break;
	                
	        case "Div": if(y!=0) 
	                    {
	        	            z=x/y;
	        	            out.println("<h1>Div: " + z + "</h1>");
	        	        } 
		                else 
		                {
		                    out.println("<h1>Error: Cannot divide by zero.</h1>");
		                    return;
		                }
		                break;
	                
	        default: out.println("<h1>Error: Invalid Input.</h1>");
	                 return;
        }


	}

}