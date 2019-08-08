package com.deloitte.clustomer.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.deloitte.dbcon.DbUtility;

public class CustomerJDBCOperations {
	
	public static void displayAllRecords() throws ClassNotFoundException, SQLException {
		Connection connection = DbUtility.getMyConnection();	
		Statement statement = connection.createStatement();
		
		ResultSet res = statement.executeQuery("select * from HR.customer");
		
		while(res.next())
		{
			System.out.println(res.getString(1)+ " \t");
			System.out.println(res.getString(2)+ " \t");
			System.out.println(res.getString(3)+ " \t");
			System.out.println(res.getString(4));
		}
	}
	
	public static void insertNewRecord() throws ClassNotFoundException, SQLException, IOException {
	
		Connection connection = DbUtility.getMyConnection();
		Statement statement = connection.createStatement();
		System.out.println("Please enter the customer details, Id, Name, Adress amd Bill Amount respectively");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int customerId=Integer.parseInt(br.readLine());
		String customerName= br.readLine();
		String customerAddr = br.readLine();
		int billAmount = Integer.parseInt(br.readLine());
		
		int rowsAffected = statement.executeUpdate("insert into HR.customer values ("+customerId+",'"+customerName+"','"+customerAddr+"',"+billAmount+")");
		
		System.out.println(rowsAffected+" affected");
	}
	public static void insertNewRecordThroughPS() throws ClassNotFoundException, SQLException, IOException {
		
		Connection connection = DbUtility.getMyConnection();
		Statement statement = connection.createStatement();
		System.out.println("Please enter the customer details, Id, Name, Adress amd Bill Amount respectively");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int customerId=Integer.parseInt(br.readLine());
		String customerName= br.readLine();
		String customerAddr = br.readLine();
		int billAmount = Integer.parseInt(br.readLine());
		
		PreparedStatement statement1 = 
				connection.prepareStatement("insert into HR.customer values(?,?,?,?)");
		statement1.setInt(1, customerId);
		statement1.setString(2, customerName);
		statement1.setString(3, customerAddr);
		statement1.setInt(4, billAmount);
		
		
		int rowsAffected = statement1.executeUpdate();
		
		System.out.println(rowsAffected+" affected");
	}
public static void deleteARecordThroughPS() throws ClassNotFoundException, SQLException, IOException {
		
		Connection connection = DbUtility.getMyConnection();
		Statement statement = connection.createStatement();
		System.out.println("Please enter the customer details, Id, Name, Adress amd Bill Amount respectively");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int customerId=Integer.parseInt(br.readLine());
		
		PreparedStatement statement1 = 
				connection.prepareStatement("delete from HR.customer where customerId=?");
		statement1.setInt(1, customerId);
	
		int rowsAffected = statement1.executeUpdate();
		
		System.out.println(rowsAffected+" affected");
	}
}
