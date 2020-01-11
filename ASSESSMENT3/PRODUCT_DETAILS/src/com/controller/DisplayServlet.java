package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.ProductDaoImpl;
import com.model.Product;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDaoImpl impl=new ProductDaoImpl();
		
		List<Product> list=impl.listProducts();
		System.out.println("1");
		
		HttpSession session=request.getSession();
		session.setAttribute("allProducts", list);
		
		System.out.println("2");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("AllProducts.jsp");
		dispatcher.forward(request, response);
		
		System.out.println("3");
	}

}
