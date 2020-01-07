package com.cms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {
	public static void startCustomerApp() {
		CustomerDAO customerDAO=new CustomerDAOImpl();
		System.out.println("Welcome to customer app");
		System.out.println("1.Add Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Delete Customer");
		System.out.println("4.Fetch All Customer");
		System.out.println("5.Fetch Single Customer");
		System.out.println("6.EXIT");
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter choice(1-6)");
		int choice=sc.nextInt();
		while(true) {
		if(choice==1)
		{
			Customer customer=new Customer();
			customer.acceptCustomerDetails();
			boolean result = false;
			if(customerDAO .isCustomerExists(customer.getCustomerId())) {
				System.out.println(customer.getCustomerId() +" already exists");	
			}
			else
			{
			result=customerDAO.addCustomer(customer);
			System.out.println(customer.getCustomerName()+" added successfully");
			}
		}
		if(choice==2) {
			System.out.println("Please enter the new details :");
			Customer customer=new Customer();
			customer.acceptCustomerDetails();
			if(customerDAO.isCustomerExists(customer.getCustomerId()))
			{
				customerDAO.updateCustomer(customer);
				System.out.println(customer.getCustomerName()+" updated successfully");
			}
			else {
				System.out.println(customer.getCustomerId()+" does not exist");
			}
		}
		if(choice==3)
		{
			System.out.println("Please enter customer id to delete:");
			int customerId=sc.nextInt();
			if(customerDAO.isCustomerExists(customerId))
			{
				customerDAO.deleteCustomer(customerId);
				System.out.println(customerId+" deleted successfully");
			}
			else
			{
				System.out.println(customerId+" does not exist");
			}
			
			
		}
		if(choice==4)
		{
			List<Customer> allCustomers= new ArrayList<Customer>();
			allCustomers=customerDAO.listCustomers();	
			System.out.println("List of all customers: ");
			System.out.println(allCustomers);
		}
		if(choice==5)
		{
			System.out.println("Please enter customer id to  search:");
			int customerId=sc.nextInt();
			if(customerDAO.isCustomerExists(customerId))
			{
				Customer customer=customerDAO.findCustomer(customerId);
				System.out.println(customer);
				System.out.println("Details of " +customerId+" fetched successfully");
				
			}
			else
			{
				System.out.println(customerId+" does not exist");
			}
		}
		
		if(choice==6)
		{
			System.out.println("Thanks for using customer app");
			System.exit(0);
		}
	}
	}

}
