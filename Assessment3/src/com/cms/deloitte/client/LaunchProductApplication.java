package com.cms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.deloitte.dao.ProductDAO;
import com.cms.deloitte.dao.impl.ProductDAOImpl;
import com.cms.deloitte.model.Product;

public class LaunchProductApplication {

	public static void startProductApp() {

		ProductDAO productDAO = new ProductDAOImpl();

		System.out.println("#### Welcome to Product App ####");
		System.out.println("#### 1. Add Product         ####");
		System.out.println("#### 2. Update Product      ####");
		System.out.println("#### 3. Delete Product      ####");
		System.out.println("#### 4. Find Product        ####");
		System.out.println("#### 5. Print Product        ####");
		System.out.println("#### 6. EXIT                 ####");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice(1-6)");
			int choice = scanner.nextInt();
			if (choice == 1) {
				Product product = new Product();
				product.acceptProductDetails();
				boolean result = false;
				if (productDAO.isProductExists(product.getProductId())) {
					System.out.println(product.getProductId() + " already exists");
				} else {
					result = productDAO.addProduct(product);
					System.out.println(product.getProductName() + " added successfully !!!");
				}

			}
			if (choice == 2) {
				System.out.println("Please enter the new details : ");
				Product product = new Product();
				product.acceptProductDetails();
				if (productDAO.isProductExists(product.getProductId())) {
					productDAO.updateProduct(product);
					System.out.println(product.getProductName() + " updated successfully");
				} else {
					System.out.println(product.getProductId() + " doesn't exixts");
				}
			}
			if (choice == 3) {
				System.out.println("Enter product Id : ");
				int productId = scanner.nextInt();
				if (productDAO.isProductExists(productId)) {
					productDAO.deleteProduct(productId);
					System.out.println(productId + " deleted succsessfully !!!");
				} else {
					System.out.println(productId + " doesn't exist!!!");
				}
			}
			if (choice == 4) {
				System.out.println("Enter product Id to search : ");
				int productId = scanner.nextInt();
				if (productDAO.isProductExists(productId)) {
					Product product = productDAO.findProduct(productId);
					System.out.println(product);
				} else {
					System.out.println(productId + " doesn't exist!!!");
				}
			}
			if (choice == 5) {
				List<Product> allproducts = new ArrayList<Product>();
				allproducts = productDAO.listProducts();
				System.out.println(allproducts);
			}
			
			if (choice == 6) {
				System.out.println("Thanks for using my product app");
				System.exit(0);
			} 
		}

	}
}
