package com.cms.deloitte.model;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
	private int productId;
	private String productName;
	private int quantity;
	private int price;
	public Product() {
		
	}
	

	public Product(int productId, String productName, int qoh, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void acceptProductDetails() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter product id : "); productId = scanner.nextInt();
	        System.out.println("Enter product name : "); productName = scanner.next();
	        System.out.println("Enter quantity : "); quantity = scanner.nextInt();
	        System.out.println("Enter price : "); price = scanner.nextInt();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", Quantity=" + quantity + ", price=" + price
				+ "]";
	}


		

}
