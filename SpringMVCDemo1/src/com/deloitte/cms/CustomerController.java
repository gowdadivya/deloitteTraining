package com.deloitte.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired(required=false)
	CustomerDAOImpl customerDAO;
	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer) {
		customerDAO.insertCustomer(customer);
		return new ModelAndView("success","cust",customer);
	}
		
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
		return new ModelAndView("success","cust",customer);
	}

	@RequestMapping("/searchCustomerByIdForm")
	public ModelAndView searchCustomerByIdForm() {
		return new ModelAndView("customerDetailsById","command", new Customer());
	}

	@RequestMapping("/searchCustomerById")
	public ModelAndView searchCustomerById(Customer customer) {
		Customer customer2 = new Customer();
		customer2 = CustomerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("customerDetailsById","command", customer2);
	}
}
