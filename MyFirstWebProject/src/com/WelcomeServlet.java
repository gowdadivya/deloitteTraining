package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String guestName = request.getParameter("guestName");
		if(guestName.contentEquals("Divya")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("AppleServlet");
			dispatcher.forward(request, response);
		} else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("HelloServlet");
		dispatcher.forward(request, response);
		 }
	}

}
