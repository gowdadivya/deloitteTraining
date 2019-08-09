package com.deloitte.client;

import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDAO;

public class CustomerClient {
	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		
		while(true)
		{
			System.out.println("M E N U");
			System.out.println("1. Add Customer");
			System.out.println("2.Delete Customer");
			System.out.println("3.M E N U");
			System.out.println("4.M E N U");
			System.out.println("5.M E N U");
			System.out.println("6.M E N U");
			
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			
			if (option==1)
			{
				System.out.println("Enter Customer Id");
				int customerId= scanner.nextInt();
				
				boolean isExists = customerDAO.isCustomerExists(customerId);
				if(isExists)
				{
					System.out.println("Enter customer name ");
					String customerName = scanner.next();
					
					System.out.println("Enter customer address ");
					String customerAddress = scanner.next();
					
					System.out.println("Enter billAmount ");
					String billAmount = scanner.next();
				}
			}
			
			if (option==2)
			{
				System.out.println("Enter Customer Id");
				int customerId= scanner.nextInt();
				
				boolean isExists = customerDAO.isCustomerExists(customerId);
				if(isExists)
				{
					System.out.println("");
				}
			}
		}
	}

}
