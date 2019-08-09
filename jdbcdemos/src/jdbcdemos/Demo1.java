package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your choice : 1. View All Records \n 2. Insert a record");
		
		int option = scanner.nextInt();
		
		if(option==1)
		displayAllRecords();
		
		if(option==2)
		insertNewRecord();
	}

	private static void displayAllRecords() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Connected");
		
		Statement statement = connection.createStatement();
		
		ResultSet res = statement.executeQuery("select * from HR.employee");
		
		while(res.next())
		{
			System.out.println(res.getString(1)+ " ");
			System.out.println(res.getString(2));
		}
	}
	
	private static void insertNewRecord() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Connected");
		
		Statement statement = connection.createStatement();
		
		int noOfRecords = statement.executeUpdate("insert into HR.employee values(100,'Kalpana', 'Pune', 25000)");
		
		System.out.println(noOfRecords+"affected");
	}
}
