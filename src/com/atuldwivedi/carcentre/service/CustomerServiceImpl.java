package com.atuldwivedi.carcentre.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atuldwivedi.carcentre.dao.CustomerDao;
import com.atuldwivedi.carcentre.user.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public Long addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Long editCustomer(Customer customer) {
		return customerDao.editCustomer(customer);
	}

	@Override
	public Customer getCustomer(Long ID) {
		return customerDao.getCustomer(ID);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public void addOrupdateCustomer(Customer customer) {
		customerDao.addOrupdateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Long customerId) {
		customerDao.deleteCustomer(customerId);
	}

	@Override
	public List<Customer> sortCustomer(List<Customer> customers, String sortBy) {
		
	switch(sortBy) {
	
		case "FIRSTNAME":
			Collections.sort(customers, new Comparator<Customer>() {
				@Override 
				public int compare(Customer c1, Customer c2) {
					return (int)c1.getFirstName().compareTo(c2.getFirstName());
				}
			}); break;
			
		case "LASTNAME":
			Collections.sort(customers, new Comparator<Customer>() {
				@Override 
				public int compare(Customer c1, Customer c2) {
					return (int)c1.getLastName().compareTo(c2.getLastName());
				}
			});  break;
			
		case "AGE":
			Collections.sort(customers, new Comparator<Customer>() {
				@Override 
				public int compare(Customer c1, Customer c2) {
					return (int)c1.getAge().compareTo(c2.getAge());
				}
			});  break;
			
		default:
			
	}
		return customers;
		
	}
	
	

}
