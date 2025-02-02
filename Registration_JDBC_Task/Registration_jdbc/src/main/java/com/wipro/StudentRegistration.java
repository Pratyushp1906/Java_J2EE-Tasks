package com.wipro;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
/**
* Servlet implementation class StudentRegistrationServlet
*/
@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int stid = Integer.parseInt(request.getParameter("stid"));
		String stname = request.getParameter("name");
		try {
			PrintWriter pw = response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
		PreparedStatement ps = connection.prepareStatement("insert into students values(?,?)");
		ps.setInt(1, stid);
		ps.setString(2, stname);
		int x = ps.executeUpdate();
		if(x>0) {
			pw.println("<h1>");
			pw.println("Registration successully done, have a good day");
			pw.println("</h1>");
		}
		else
		{
			pw.println("<h1>");
			pw.println("something went wrong, plese try again");
			pw.println("</h1>");
		}
		connection.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}