package com.sharma.nk.cm.svcs;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sharma.nk.cm.models.Customer;

public class CustomerRepositoryNoDbImpl implements CustomerRepository {

	private static final Logger log=LoggerFactory.getLogger(CustomerRepositoryNoDbImpl.class);
	private List<Customer> customers;
	{
		customers = new ArrayList<Customer>();
		customers.add(new Customer("c001", "Neel", 95));
	}
	
	public CustomerRepositoryNoDbImpl() {
		log.info("CustomerRepositoryNoDbImpl created with Profile nodb");
	}

	@Override
	public String saveCustomer(Customer customer) {

		if (customers.stream().filter(c -> c.getCid() == customer.getCid()).findAny().orElse(null) != null) {
			return "Customer alredy exists!";
		}
		customers.add(customer);
		return customer.getCid();
	}

	@Override
	public Customer getCustomerById(String cid) {
		return customers.stream().filter(cust -> cust.getCid() == cid).findAny().orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers(int offset) {
		List<Customer> custs = new ArrayList<Customer>();
		// if offset is 0 then it should return first MAX_SIZE results

		// MAX_SIZE*offset,MAX_SIZE*(offset+1)-1
		// 5*0,5*1-1=0,4 : 4 elements -> size && MAX_SIZE*(offset+1)-1 true then add in
		// new list
		// 5*1,5*2-1=5,9 :

		int start = MAX_SIZE * offset;
		int size = customers.size();
		int ends = MAX_SIZE * (offset + 1) - 1;
		for (int i = start; i <= ends && i<size; i++) {
			custs.add(customers.get(i));
		}
		return custs;
	}

}
