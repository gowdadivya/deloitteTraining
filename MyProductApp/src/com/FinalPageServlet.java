package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FinalPageServlet
 */
@WebServlet("/FinalPageServlet")
public class FinalPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int total = (int) session.getAttribute("TotalAmount");
		String userName = (String) session.getAttribute("userName");
		
		
		response.getWriter().println("Hello "+userName+", Your Bill amount is : "+total);
		
	}

	private String getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private HttpSession requestGetSession() {
		// TODO Auto-generated method stub
		return null;
	}

}
