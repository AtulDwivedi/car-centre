package com.atuldwivedi.carcentre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

	@Transactional
	@RequestMapping("/save-customer")
	public String processRegisterCustomer(@ModelAttribute("customer") Customer customer, Model model) {

		// System.out.println("customer controller "+customer);
		// saving into database
		// CustomerDao customerDao = new CustomerDaoImpl();

		customerDao.addCustomer(customer);

		List<Customer> customers = customerDao.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@Transactional
	@RequestMapping("/list")
	public String listCustomer(Model model) {
		List<Customer> customers = customerDao.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
}
