package com.model;

import java.io.Serializable;

public class Product implements Serializable{

	private int productId;
	private String productName;
	private int QOH;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int qOH, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		QOH = qOH;
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

	public int getQOH() {
		return QOH;
	}

	public void setQOH(int qOH) {
		QOH = qOH;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", QOH=" + QOH + ", price=" + price
				+ "]";
	}
	
	
}
