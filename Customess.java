package generics;
import java.io.Serializable;
import java.util.Scanner;


	public class Customess implements Serializable,Comparable<Customess> {
		
		private int customerId;
		private String customerName;
		private String customerAddress;
		private transient int billAmount;//billamount becomes 0 on adding transient
		
		public void accept() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
	        System.out.println("Enter customer name : "); customerName = scanner.next();
	        System.out.println("Enter customer address : "); customerAddress = scanner.next();
	        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
	    }
		public Customess()
		{
			
		}
		public Customess(int custId, String custName, String custAddrs, int billamt) {
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
		public int compareTo(Customess o) {
			if(this.getBillAmount() < o.getBillAmount())
				return -1;
			else
				return 0;
		
		}
	}


