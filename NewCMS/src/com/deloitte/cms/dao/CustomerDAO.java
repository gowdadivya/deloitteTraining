package com.deloitte.cms.dao;

import java.util.List;

import com.deloitte.cms.model.Customer;

//to write all the method names and their signatures
public interface CustomerDAO {
	public List<Customer> getAllCustomers();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public Customer searchCustomerById(int customerId);
	public boolean isCustomerExists(int customerId);
}
