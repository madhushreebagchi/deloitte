package com.cms.deloitte.dao.impl;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cms.deloitte.dao.CustomerDAO;

import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	
	Configuration configuration=null;
	SessionFactory factory=null;
	public CustomerDAOImpl() 
	{
		// TODO Auto-generated constructor stub
		 configuration=new Configuration().configure();
		 factory=configuration.buildSessionFactory();
	}
	@Override
	public boolean addCustomer(Customer customer) {
		Configuration configuration=new Configuration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
			return false;
		}
		
	

	@Override
	public boolean updateCustomer(Customer customer){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(customer);
		//Customer fetchedCustomer=(Customer)session.get(Customer.class, customerId);
		
		transaction.commit();
		session.close();

			return false;
		
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		
			return false;
		
	}
	@Override
	public List<Customer> listCustomers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from Customer");
		return query.list();
	 
		
	}

	@Override
	public Customer findCustomer(int customerId) {
		
		Session session=factory.openSession();
		Customer customer=(Customer)session.get(Customer.class,customerId);
		session.close();
		return customer;
	}


	@Override
	public boolean isCustomerExists(int customerId){
		Session session=factory.openSession();
		Customer customer=(Customer)session.get(Customer.class,customerId);
		session.close();
		if(customer==null) {
			return false;
		}
		else
		{
			return true;
		}
		
		
	}
	@Override
	public List<Customer> filterCustomer(String customerAddress,int billAmount)
{
	Session session=factory.openSession();
	Criteria criteria=session.createCriteria(Customer.class);
	criteria.add(Restrictions.like("customerAddress", customerAddress));
	criteria.add(Restrictions.gt("billAmount", billAmount));
	return criteria.list();
}


}
