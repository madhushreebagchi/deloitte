package com.Demospring;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Set;
import javax.annotation.*;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;*/
public class Customer implements Serializable,InitializingBean,DisposableBean {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	private ContactDetails contactDetails;
	private Set cards;
	@PostConstruct
	public void displayCust()
	{
		
		System.out.println("####Init called");
	}
	@PreDestroy
	public void cleanUpMyApp()
	{
		
		System.out.println("####Destroyed");
	}

	public Set getCards() {
		return cards;
	}

	public void setCards(Set cards) {
		this.cards = cards;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Customer(){
		
	}
	
	public Customer(ContactDetails contactDetails) {
		super();
		this.contactDetails = contactDetails;
	}
	
	public Customer(int customerId, String customerName, String customerAddress, int billAmount,
			ContactDetails contactDetails) {
		super();
	
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
		this.contactDetails = contactDetails;
	}
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
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + ", contactDetails=" + contactDetails + ", cards="
				+ cards + "]";
	}
	public void destroy() throws Exception {
		System.out.println("####Destroyed by interface");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("####Init by interface");
		
	}
	
	

}
