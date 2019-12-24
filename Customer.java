package oops;

public class Customer {
	
private int customerId;
private String customerName;
private String customerAddress;
private int billAmount=1000;

public Customer() {
	customerId = 1001;
	customerName = "NA";
	customerAddress = "NA";
	billAmount = 500;
	/*System.out.println("Customer cons called");*/

}
public Customer(int customerId,String customerName,String customerAddress,int billAmount) {
	/*System.out.println("Customer2cons called");*/
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.billAmount=billAmount;
}
/*public Customer(int customerId,String customerName) {
	System.out.println("Customer3cons called");
	this.customerId=customerId;
	this.customerName=customerName;	
}*/
public void display() {
	System.out.println(customerId);
	System.out.println(customerName);
	System.out.println(customerAddress);
	System.out.println(billAmount);
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
	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer(20,"Madhu","Pune",5000);
		/*Customer c3=new Customer(22,"Maddy");
		c3.display();*/
		c1.display();
		c2.display();
	

	}

}
