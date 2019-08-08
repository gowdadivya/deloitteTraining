package com.deloitte.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.deloitte.clustomer.db.CustomerJDBCOperations;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		System.out.println("M E N U \n");
		System.out.println("1. Display all customer records \n");
		System.out.println("2. Insert customer details from user\n");
		System.out.println("3. Insert customer details from user using prepared statemnets\n");
		System.out.println("4. Enter customer ID of the entry you want to delete\n");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your choice : \n");
		
		int option = scanner.nextInt();
		
		if(option == 1)
			CustomerJDBCOperations.displayAllRecords();
		
		if(option == 2)
			CustomerJDBCOperations.insertNewRecord();	
		
		if(option == 3)
			CustomerJDBCOperations.insertNewRecordThroughPS();	
		
		if(option == 4)
			CustomerJDBCOperations.deleteARecordThroughPS();	
	}

}
