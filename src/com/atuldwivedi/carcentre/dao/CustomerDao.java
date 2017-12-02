package com.atuldwivedi.carcentre.dao;

import java.util.List;

import com.atuldwivedi.carcentre.user.Customer;

public interface CustomerDao {

	public Long addCustomer(Customer customer);
	
	public Long editCustomer(Customer customer);
	
	public Customer getCustomer(Long ID);

	public List<Customer> getCustomers();
	
	

}
