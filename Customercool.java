package inheritance;

public class Customercool {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	

	public Customercool(int customerId2, String customerName2, String customerAddress2, int billAmount2) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = 9000;
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
		return "Customercool [customerId=" + getCustomerId() + ", customerName=" + getCustomerName() + ", customerAddress="
				+ getCustomerAddress() + ", billAmount=" + getBillAmount() + "]";
	}
	
}
