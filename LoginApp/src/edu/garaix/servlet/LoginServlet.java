package edu.garaix.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.garaix.servlet.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID, password;
		
		userID = request.getParameter("userID");
		password = request.getParameter("password");
		System.out.println(userID);
		
		// Business service to pass this doPost
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userID, password);
		
		if (result) {
			response.sendRedirect("success.jsp");
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
