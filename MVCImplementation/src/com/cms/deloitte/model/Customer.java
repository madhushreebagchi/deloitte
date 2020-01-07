package com.cms.deloitte.model;

import java.util.Scanner;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	public Customer()
	{
		
	}
	public Customer(int customeId, String customeName, String customeAddress, int billMount) {
		super();
		this.customerId = customeId;
		this.customerName = customeName;
		this.customerAddress = customeAddress;
		this.billAmount = billMount;
	}
	public void accept()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
        System.out.println("Enter customer name : "); customerName = scanner.next();
        System.out.println("Enter customer address : "); customerAddress = scanner.next();
        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
    }
	public int getCustomeId() {
		return customerId;
	}
	public void setCustomeId(int customeId) {
		this.customerId = customeId;
	}
	public String getCustomeName() {
		return customerName;
	}
	public void setCustomeName(String customeName) {
		this.customerName = customeName;
	}
	public String getCustomeAddress() {
		return customerAddress;
	}
	public void setCustomeAddress(String customeAddress) {
		this.customerAddress = customeAddress;
	}
	public int getBillMount() {
		return billAmount;
	}
	public void setBillMount(int billMount) {
		this.billAmount = billMount;
	}
	@Override
	public String toString() {
		return("Customer Id: "+getCustomeId()+", Customer Name: "+getCustomeName()+", Customer Address:"+getCustomeAddress()+", Bill Amount: "+getBillMount());

	}
}
