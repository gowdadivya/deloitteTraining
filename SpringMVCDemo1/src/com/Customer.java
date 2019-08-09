package com;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Customer {

	@RequestMapping("/Add")
	public String mapper() {
		return "AddCustomer";
	}
	
	@RequestMapping("/Update")
	public String mapper1() {
		return "UpdateCustomer";
	}
	
	@RequestMapping("/Delete")
	public String mapper2() {
		return "DeleteCustomer";
	}
	
	@RequestMapping("/FindById")
	public String mapper3() {
		return "FindCustomerByCustomer";
	}
	
	@RequestMapping("/AllCustomer")
	public String mapper4() {
		return "FindAllCustomer";
	}
}
