package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticateServlet
 */
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out = response.getWriter();
		Cookie allCookies[]= request.getCookies();
		boolean alreadyVisited = false;
		if(allCookies != null) {
			for(Cookie c :allCookies) {
				if(c.getName().equals(username)) {
					alreadyVisited = true;
					break;
				}
			}
		}
		out.println("<h2>succesfully authenticated");
		
		if(!alreadyVisited) {
			out.println("<h2>welcome, you have visited my page for first time: "+username);
			Cookie cookie = new Cookie(username,username);
			response.addCookie(cookie);
		}
		else {
			out.println("<h2>welcome, you have already visited this page: "+username);
		}
		out.println("<h1><form action='WelcomeServlet'>");
		out.println("<h1>Wife name : <input type='text' name='wifeName'>");
		out.println("<h1><input type='hidden' name='userName' value="+username);
		out.println("<h1><input type='submit' value='Enter'>");
		out.println("<h1></form>");

	}

}
