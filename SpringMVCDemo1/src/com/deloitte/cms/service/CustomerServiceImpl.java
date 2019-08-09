package com.deloitte.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired(required=false)
	CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		if(customer.getCustomerId()>0)
			return customerDAO.insertCustomer(customer);
		else
			return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.searchCustomerById(customerId);
	}

	@Override
	public boolean isCustomerExists(int customerID) {
		// TODO Auto-generated method stub
		return false;
	}

}
