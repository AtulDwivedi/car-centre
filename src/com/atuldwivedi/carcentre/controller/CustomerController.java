package com.atuldwivedi.carcentre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atuldwivedi.carcentre.dao.CustomerDao;
import com.atuldwivedi.carcentre.dao.CustomerDaoImpl;
import com.atuldwivedi.carcentre.user.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;

	@RequestMapping("/registration")
	public String registerCustomer(Model model) {
		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-registration";
	}
	
	@RequestMapping("/save-customer")
	public String processRegisterCustomer(@ModelAttribute("customer") Customer customer) {
		
		//System.out.println("customer controller "+customer);
		//saving into database
//		CustomerDao customerDao = new CustomerDaoImpl();
		
		customerDao.addCustomer(customer);
		
		return "customer-show";
	}
}
