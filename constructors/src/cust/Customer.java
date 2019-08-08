package cust;

public class Customer {
	int CustomerId;
	String CustomerName;
	String CustomerAddr;
	int billAmt;
	
	public Customer() {
		
	}
	public Customer(int CustomerId, String CustomerName, String cAddr, int billamt) {
		super();
		CustomerId = CustomerId;
		CAddr = cAddr;
		this.billamt = billamt;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CAddr=" + CAddr + ", billamt=" + billamt + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CAddr == null) ? 0 : CAddr.hashCode());
		result = prime * result + ((CustomerName == null) ? 0 : CustomerName.hashCode());
		result = prime * result + CustomerId;
		result = prime * result + billamt;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (CAddr == null) {
			if (other.CAddr != null)
				return false;
		} else if (!CAddr.equals(other.CAddr))
			return false;
		if (CustomerName == null) {
			if (other.CustomerName != null)
				return false;
		} else if (!CustomerName.equals(other.CustomerName))
			return false;
		if (CustomerId != other.CustomerId)
			return false;
		if (billamt != other.billamt)
			return false;
		return true;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddr() {
		return CustomerAddr;
	}
	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}
	public int getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	


}
