package com.sharma.nk.cm.svcs;

import java.util.List;

import com.sharma.nk.cm.models.Customer;

public interface CustomerRepository {
	
	int MAX_SIZE = 5;

	public String saveCustomer(Customer customer);

	public Customer getCustomerById(String cid);

	public List<Customer> getAllCustomers(int offset);
}
