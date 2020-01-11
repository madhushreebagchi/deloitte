package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.ProductDaoImpl;
import com.model.Product;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productId=Integer.parseInt(request.getParameter("productId"));
		String productName=request.getParameter("productName");
		int QOH=Integer.parseInt(request.getParameter("QOH"));
		int price=Integer.parseInt(request.getParameter("price"));
		
		Product product=new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setQOH(QOH);
		product.setPrice(price);
		
		ProductDaoImpl impl=new ProductDaoImpl();
		impl.addProduct(product);
		
		System.out.println("sevlet done");

		HttpSession session=request.getSession();
		session.setAttribute("productObj", product);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("display.jsp");
		dispatcher.forward(request, response);
		
		
		
		
		
		
		
	}

}
