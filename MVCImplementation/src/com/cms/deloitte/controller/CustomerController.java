package com.cms.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cms.deloitte.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		String customerName=request.getParameter("customerName");
		String customerAddress=request.getParameter("customerAddress");
		int billAmount=Integer.parseInt(request.getParameter("billAmount"));
		//updating the model
		Customer customer=new Customer(customerId,customerName,customerAddress,billAmount);
		HttpSession session=request.getSession();
		session.setAttribute("cust", customer);
		RequestDispatcher dispatcher=request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);

		}

}
