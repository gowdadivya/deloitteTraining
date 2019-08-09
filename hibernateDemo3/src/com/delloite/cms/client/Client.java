package com.delloite.cms.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.delloite.cms.model.Address;
import com.delloite.cms.model.EmployeeDetails;

public class Client {
	public static void main(String[] args) {
	
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Set allAddress = new HashSet();
		
		EmployeeDetails emp1 = new EmployeeDetails(1,"Aadi",95000);
		EmployeeDetails emp2 = new EmployeeDetails(2,"Amyra",65000);
		EmployeeDetails emp3 = new EmployeeDetails(3,"Anisha",35000);
		
		Address address1 = new Address(1,"Hyd", "Telangana");
		Address address2 = new Address(2,"Blr", "Karnataka");
		
		allAddress.add(address1);
		allAddress.add(address2);
		
		emp1.setEmployeeAddress(allAddress);
		emp2.setEmployeeAddress(allAddress);
		Transaction transaction = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		System.out.println("Your data has been updated!!");
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
