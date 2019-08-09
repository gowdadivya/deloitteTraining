package com;

import java.nio.charset.MalformedInputException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.AppConfiguration;
//client for spring with annotations
public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"beans.xml","second.xml"});
		
		Customer customer = context.getBean(Customer.class);
		Address address = context.getBean(Address.class);
		
		customer.setCustomerId(123);
		customer.setCustomerName("Aadya");
		customer.setCustomerAddress("Mysuru");
		customer.setBillAmount(12300);
		
		address.setaId(12345);
		address.setCity("Mysuru");
		address.setState("Karnataka");
		
		customer.setAddress(address);
		
		System.out.println(customer);
		System.out.println("Yaaaaaaay");
		System.out.println();
		context.registerShutdownHook();
	}
}
