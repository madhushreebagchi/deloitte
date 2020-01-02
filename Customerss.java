package inheritance;

public class Customerss implements Comparable<Customerss> {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	
	public Customerss()
	{
		
	}
	public Customerss(int custId, String custName, String custAddrs, int billamt) {
		super();
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.billAmount=billAmount;
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
		return "Customerss [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}
	@Override
	public int compareTo(Customerss o) {
		if(this.getBillAmount() < o.getBillAmount())
			return -1;
		else
			return 0;
	
	}
}