package com.atuldwivedi.carcentre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atuldwivedi.carcentre.dao.CustomerDao;
import com.atuldwivedi.carcentre.dao.CustomerDaoImpl;
import com.atuldwivedi.carcentre.service.CustomerService;
import com.atuldwivedi.carcentre.user.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/add")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "add-customer";
	}
	
	@Transactional
	@RequestMapping("/update")
	public String updateCustomer(@RequestParam("customerId") Long customerId, Model model) {
		// fetch the customer from db
		Customer customer = customerService.getCustomer(customerId);
		model.addAttribute("customer", customer);
		return "add-customer";
	}

	@Transactional
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") Long customerId, Model model) {
		// fetch the customer from db
		customerService.deleteCustomer(customerId);
		return listCustomer(model);
	}
	
	@Transactional
	@RequestMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model) {

		customerService.addOrupdateCustomer(customer);

		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@Transactional
	@RequestMapping("/list")
	public String listCustomer(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	
	
}
