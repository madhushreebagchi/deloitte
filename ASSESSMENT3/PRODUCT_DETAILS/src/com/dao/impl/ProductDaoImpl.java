package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dao.ProductDao;
import com.model.Product;

public class ProductDaoImpl implements ProductDao {

	Configuration configuration=null;
	SessionFactory factory=null;
	
	public ProductDaoImpl() {
		configuration=new Configuration().configure();//this looks for hibernate.cfg.xml
		factory=configuration.buildSessionFactory();
	}
	
	public boolean addProduct(Product product) {
		
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.save(product);
		
		transaction.commit();
		
		session.close();
		System.out.println("added");
		return false;
	}
	
	public List<Product> listProducts() {
		
		Session session=factory.openSession();
		Query query=session.createQuery("from Product");
		
		return query.list();
		
	}
	
	
}
