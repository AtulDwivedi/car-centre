package com.atuldwivedi.carcentre.service;

import java.util.List;

import com.atuldwivedi.carcentre.user.Customer;

public interface CustomerService {

	public Long addCustomer(Customer customer);
	
	public Long editCustomer(Customer customer);
	
	public Customer getCustomer(Long ID);

	public List<Customer> getCustomers();
	
	public void addOrupdateCustomer(Customer customer);
	
	public void deleteCustomer(Long customerId);
	
	public  List<Customer> sortCustomer(List<Customer> customer,String shotBy);

}
