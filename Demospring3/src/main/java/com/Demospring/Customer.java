package com.Demospring;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	private ContactDetails contactDetails;
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Customer(){
		
	}
	//autowiring by contact details constructor 
	public Customer(ContactDetails contactDetails) {
		super();
		this.contactDetails = contactDetails;
	}
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
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
				+ customerAddress + ", billAmount=" + billAmount + "\n" + contactDetails + "]";
	}
	/*public void acceptCustomerDetails() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
	        System.out.println("Enter customer name : "); customerName = scanner.next();
	        System.out.println("Enter customer address : "); customerAddress = scanner.next();
	        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
	}
	*/

}
