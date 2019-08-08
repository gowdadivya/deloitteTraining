package collections;

import java.util.*;
import udexception.*;

public class Demo1 {
	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer1 = new Customer(1,"Neha","Jaipur",4500);
		customerList.add(new Customer(2,"Anusha","Andhra",7600));
		customerList.add(new Customer(3,"Zakira","mysore",6700));
		customerList.add(new Customer(4,"Radha","Delhi",5460));
		customerList.add(new Customer(5,"Uma","mumbai",580));
		
		Iterator<Customer> iterator = customerList.iterator();
		
		System.out.println("Customer who bill is>5000");
		while(iterator.hasNext()) {
			Customer cust = iterator.next();
			if(cust.getBillAmount()>5000)
				System.out.println(cust);
		} 
		
		System.out.println("1. Name 2. Bill amount \n Sort based on any of the above");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		if(option == 1)
			Collections.sort(customerList);
		if(option==2)
			Collections.sort(customerList, new CustomerBillAmountComparator());
		Collections.sort(customerList);
		
		Iterator<Customer> iterator1 = customerList.iterator();
		System.out.println("All Customers : ");
		while(iterator1.hasNext()) {
			Customer cust = iterator1.next();
			System.out.println(cust);
			}
		}
	}
}
