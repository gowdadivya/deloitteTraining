package com.deloitte.cms.dao.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private final static String SELECT_CUSTOMER_QUERY = "select * from HR.customer where customerId = ?";
	private final static String INSERT_CUSTOMER_QUERY = "insert into HR.customer values (?,?,?,?)";
	private final static String UPDATE_CUSTOMER_QUERY = "update HR.customer set customerName = ?,customerAddress = ?, billAmount = ? where customerId = ?";
	private final static String DELETE_CUSTOMER_QUERY = "delete from HR.customer where customerID = ?";
	private final static String GET_ALL_CUSTOMER_QUERY = "select * from HR.customer";
	
	
	public List<Customer> getAllCustomers() {
		Connection connection = DbUtility.getMyConnection();
		List<Customer> allCustomers = new ArrayList<Customer>();
		boolean isUserExists = false;
		Customer customer = new Customer();
		try {
			PreparedStatement statement = 
					connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);
	
			ResultSet resultSet = statement.executeQuery();
		
			while(resultSet.next()) {
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(1));
			allCustomers.add(customer);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		return allCustomers;
		
	}

	public boolean insertCustomer(Customer customer) {
		
		int rowsAffected = 0;
		Connection connection = DbUtility.getMyConnection();

		try {

				PreparedStatement statement = 
					connection.prepareStatement(INSERT_CUSTOMER_QUERY);
				statement.setInt(1, customer.getCustomerId());
				statement.setString(2, customer.getCustomerName());
				statement.setString(3, customer.getCustomerAddress());
				statement.setInt(4, customer.getBillAmount());
				
				rowsAffected = statement.executeUpdate();
				
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(rowsAffected==1) {
			return true;
		}
		else
			return false;
	}

	
	public boolean updateCustomer(Customer customer) {
		int rowsAffected = 0;
		Connection connection = DbUtility.getMyConnection();
		
		
		try {
				PreparedStatement statement = 
					connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
				statement.setInt(4, customer.getCustomerId());
				statement.setString(1, customer.getCustomerName());
				statement.setString(2, customer.getCustomerAddress());
				statement.setInt(3, customer.getBillAmount());
				
				rowsAffected = statement.executeUpdate();
				
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(rowsAffected==1) {
			return true;
		}
		else
			return false;
	}
	
	public boolean deleteCustomer(int customerId) {
		boolean isUserExists = false;
		Connection connection = DbUtility.getMyConnection();
			try {
			PreparedStatement statement = 
					connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
		
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				isUserExists = true;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
			return isUserExists;
	}
	
	public Customer searchCustomerById(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		boolean isUserExists = false;
		Customer customer = new Customer();
		try {
			PreparedStatement statement = 
					connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			
			ResultSet resultSet = statement.executeQuery();
			
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(1));
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return customer;
}
	
	public boolean isCustomerExists(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		boolean isUserExists = false;
		try {
			PreparedStatement statement = 
					connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				isUserExists = true;
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return isUserExists;
	}

}
