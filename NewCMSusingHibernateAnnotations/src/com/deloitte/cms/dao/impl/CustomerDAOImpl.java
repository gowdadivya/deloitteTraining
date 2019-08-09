package com.deloitte.cms.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;


public class CustomerDAOImpl implements CustomerDAO {
	
	AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
	SessionFactory factory=configuration.buildSessionFactory();
	Session session;

	
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		session = factory.openSession();
		
		/*Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("customerAddress", "coorg"));
		return criteria.list();*/
		
		Query  query = session.createQuery("from com.deloitte.cms.model.Customer");
		Iterator iterator = query.iterate();
		
		while(iterator.hasNext()) {
			Customer customer = (Customer) iterator.next();
			allCustomers.add(customer);		
			}
		
		return allCustomers;
		
	}
	private static final String INSERT_CUSTOMER_QUERY="insert into hr.customer values (?,?,?,?)";
	@Override
	public boolean insertCustomer(Customer customer) {
		
		session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
	return true;
	}
	
	public boolean updateCustomer(Customer customer) {
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
			
	}
	private static final String DELETE_CUSTOMER_QUERY="delete from HR.customer where customerId=?";
	@Override
	public boolean deleteCustomer(int customerID) {
		
		session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer();
		customer.setCustomerId(customerID);
		session.delete(customer);
		transaction.commit();
		session.close();
		
	return true;
		
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		
		session = factory.openSession();
		Customer customer=new Customer();
		customer=(Customer)session.get(Customer.class,customerId);
		
		session.close();
		
		return customer;

		
	}
	private static final String SELECT_CUSTOMER_QUERY="select * from HR.customer where CID=?";
	@Override
	public boolean isCustomerExists(int customerId) {
	
		session = factory.openSession();
		Customer customer=new Customer();
		customer=(Customer)session.get(Customer.class,customerId);
		session.close();
		if(customer==null)
			return false;
		else
			return true;
	
		
	}

}
