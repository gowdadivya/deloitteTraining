package com.deloitte.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {
	 public static Connection getMyConnection()  {
		  	Connection connection = null;
		  	Properties properties = new Properties();
		  	FileReader reader = null;
			try {
				reader = new FileReader("c:\\delloite\\mydatabase.properties.txt");
			} catch (FileNotFoundException e2) {
				e2.printStackTrace();
			}
		  	try {
				properties.load(reader);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		  	
		  	String driver = properties.getProperty("driver");
		  	String url = properties.getProperty("url");
		  	String username = properties.getProperty("username");
		  	String password = properties.getProperty("password");
		  	
			try {
					Class.forName(driver);
			} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			try {connection = DriverManager.getConnection(url,username,password);
				System.out.println("Connected");
				return connection;
			}catch(SQLException e) {
		  		e.printStackTrace();
		  	}
			return connection;
	 }
}
