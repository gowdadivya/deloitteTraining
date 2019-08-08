package com.delloite.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.delloite.cms.model.Customer;

public class Client {
	public static void main(String[] args) {
		
		
		//searches for hibernate.cfg.xml - and creates db conxn
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer)session.get(Customer.class, 1817);
		customer.setCustomerName("Giri");
		customer.setCustomerAddress("Kolkatta");
		System.out.println(customer);
		session.save(customer);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
