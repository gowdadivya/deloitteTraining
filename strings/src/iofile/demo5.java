package iofile;
 import java.io.*;
class Customer1 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Customer1Id;
	private String Customer1Name;
	private String Customer1Addr;
	private int billAmount;
	
	public Customer1() {
		// TODO Auto-generated constructor stub
	}

	public Customer1(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getCustomer1Id() {
		return Customer1Id;
	}

	public void setCustomer1Id(int Customer1Id) {
		this.Customer1Id = Customer1Id;
	}

	public String getCustomer1Name() {
		return Customer1Name;
	}

	public void setCustomer1Name(String Customer1Name) {
		this.Customer1Name = Customer1Name;
	}

	public String getCustomer1Addr() {
		return Customer1Addr;
	}

	public void setCustomer1Addr(String Customer1Addr) {
		this.Customer1Addr = Customer1Addr;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	
}

public class demo5 {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		try {
			Customer1 Customer1 = new Customer1(7861,"Aadi","Moon",15000);
			
			ObjectOutputStream stream = 
				new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(
							new File("record.txt"))));
			stream.writeObject(Customer1);
			System.out.println("record is saved");
			stream.close();
			
			ObjectInputStream stream1 = 
					new ObjectInputStream(
						new BufferedInputStream(
							new FileInputStream(
								new File("record.txt"))));
				stream1.readObject();
				System.out.println("record is saved");
				stream1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
	}
}
		


