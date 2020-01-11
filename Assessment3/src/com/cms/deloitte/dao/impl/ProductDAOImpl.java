package com.cms.deloitte.dao.impl;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cms.deloitte.dao.ProductDAO;

import com.cms.deloitte.model.Product;

public class ProductDAOImpl implements ProductDAO{
	
	Configuration configuration=null;
	SessionFactory factory=null;
	public ProductDAOImpl() 
	{
		// TODO Auto-generated constructor stub
		 configuration=new Configuration().configure();
		 factory=configuration.buildSessionFactory();
	}
	@Override
	public boolean addProduct(Product product) {
		Configuration configuration=new Configuration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
			return false;
		}
		
	

	@Override
	public boolean updateProduct(Product product){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(product);
		
		transaction.commit();
		session.close();

			return false;
		
	}

	@Override
	public boolean deleteProduct(int productId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=new Product();
		product.setProductId(productId);
		session.delete(product);
		transaction.commit();
		session.close();
		
			return false;
		
	}
	@Override
	public List<Product> listProducts() {
		Session session=factory.openSession();
		Query query=session.createQuery("from Product");
		return query.list();
	 
		
	}

	@Override
	public Product findProduct(int productId) {
		
		Session session=factory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}


	@Override
	public boolean isProductExists(int productId){
		Session session=factory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		if(product==null) {
			return false;
		}
		else
		{
			return true;
		}
		
		
	}
	


}
