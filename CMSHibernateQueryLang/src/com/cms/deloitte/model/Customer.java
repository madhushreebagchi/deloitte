package com.cms.deloitte.model;

import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hr.Customer600")
public class Customer implements Serializable {
	@Id
	private int customerId;
	@Column(name="CustomerName")
	private String customerName;
	@Column
	private String customerAddress;
	@Column
	private  int billAmount;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}
	public void acceptCustomerDetails() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
	        System.out.println("Enter customer name : "); customerName = scanner.next();
	        System.out.println("Enter customer address : "); customerAddress = scanner.next();
	        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
	}
	

}
