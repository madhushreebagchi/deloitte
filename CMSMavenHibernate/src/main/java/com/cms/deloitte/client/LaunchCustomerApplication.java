package com.cms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {

	public static void startCustomerApp() {

		CustomerDAO customerDAO = new CustomerDAOImpl();

		System.out.println("#### Welcome to customer App ####");
		System.out.println("#### 1. Add Customer         ####");
		System.out.println("#### 2. Update Customer      ####");
		System.out.println("#### 3. Delete Customer      ####");
		System.out.println("#### 4. Find Customer        ####");
		System.out.println("#### 5. Print Customer        ####");
		System.out.println("#### 6. Filter Customer by address and billamount    ####");
		System.out.println("#### 7. EXIT                 ####");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice(1-7)");
			int choice = scanner.nextInt();
			if (choice == 1) {
				Customer customer = new Customer();
				customer.acceptCustomerDetails();
				boolean result = false;
				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					System.out.println(customer.getCustomerId() + " already exixts");
				} else {
					result = customerDAO.addCustomer(customer);
					System.out.println(customer.getCustomerName() + " added successfully !!!");
				}

			}
			if (choice == 2) {
				System.out.println("Please enter the new details : ");
				Customer customer = new Customer();
				customer.acceptCustomerDetails();
				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					customerDAO.updateCustomer(customer);
					System.out.println(customer.getCustomerName() + " updated successfully");
				} else {
					System.out.println(customer.getCustomerId() + " doesn't exixts");
				}
			}
			if (choice == 3) {
				System.out.println("Enter customer Id : ");
				int customerId = scanner.nextInt();
				if (customerDAO.isCustomerExists(customerId)) {
					customerDAO.deleteCustomer(customerId);
					System.out.println(customerId + " deleted succsessfully !!!");
				} else {
					System.out.println(customerId + " doesn't exist!!!");
				}
			}
			if (choice == 4) {
				System.out.println("Enter customer Id to search : ");
				int customerId = scanner.nextInt();
				if (customerDAO.isCustomerExists(customerId)) {
					Customer customer = customerDAO.findCustomer(customerId);
					System.out.println(customer);
				} else {
					System.out.println(customerId + " doesn't exist!!!");
				}
			}
			if (choice == 5) {
				List<Customer> allcustomers = new ArrayList<Customer>();
				allcustomers = customerDAO.listCustomers();
				System.out.println(allcustomers);
			}
			if (choice == 6) {
				System.out.println("Enter billAmount to search : ");
				int billAmount = scanner.nextInt();
				System.out.println("Enter customerAddress to search : ");
				String customerAddress = scanner.next();
				List<Customer> allcustomers = customerDAO.filterCustomer(customerAddress,billAmount);
				System.out.println(allcustomers);
			}
			if (choice == 7) {
				System.out.println("Thanks for using my customer app");
				System.exit(0);
			} 
		}

	}
}
