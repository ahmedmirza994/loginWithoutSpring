package com.ahmed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.jsp")
public class LoginServlet extends HttpServlet {
	
	private Authentication authentication = new Authentication();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/web-content/views/login.jsp").forward(request, response);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean isUserValid = authentication.isUserValid(email, password);
		
		if (isUserValid) {
			request.setAttribute("email", email);
			request.getRequestDispatcher("/web-content/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!!");
			request.getRequestDispatcher("/web-content/views/login.jsp").forward(request, response);
		}
		
	}
	
}
