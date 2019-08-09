package com.delloite.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.delloite.cms.model.Customer;
import com.delloite.cms.model.PremiumCustomer;

public class Client {
	public static void main(String[] args) {
	
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		PremiumCustomer customer = new PremiumCustomer(2,"Tufail","A",90000);
		customer.setRewardPoints(900);
		session.save(customer);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
