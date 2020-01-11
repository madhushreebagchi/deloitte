package com.cms.deloitte.cons;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cms.deloitte.dao.impl.ProductDAOImpl;
import com.cms.deloitte.model.Product;
/**
 * Servlet implementation class productController
 */
public class productController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId=Integer.parseInt(request.getParameter("productId"));
		String productName=request.getParameter("productName");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int price=Integer.parseInt(request.getParameter("price"));
		
		Product product=new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setQuantity(quantity);
		product.setPrice(price);
		
		ProductDAOImpl impl=new ProductDAOImpl();
		impl.addProduct(product);
		
		

		HttpSession session=request.getSession();
		session.setAttribute("productObj", product);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("productdetails.jsp");
		dispatcher.forward(request, response);
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
