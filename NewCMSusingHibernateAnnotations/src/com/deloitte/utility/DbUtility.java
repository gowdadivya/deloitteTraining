package com.deloitte.utility;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Properties;
	public class DbUtility {
	public static Connection getMyConnection() throws IOException {
		
		
		Connection connection=null;
		Properties property=new Properties();
		FileReader reader=null;
		try {
			reader=new FileReader("C:\\delloite\\mydatabase.properties");
			property.load(reader);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		String driver=property.getProperty("driver");
		String url=property.getProperty("url");
		String username=property.getProperty("username");
		String password=property.getProperty("password");
		
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection= DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
}


