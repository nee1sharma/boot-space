package com.sharma.nk.cm.svcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sharma.nk.cm.models.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryImplTest {

	private static final int MAX_SIZE = 5;
	private List<Customer> customers;
	private int offset=2;
	{
		customers = new ArrayList<Customer>();
		customers.add(new Customer("c001", "Neel", 95));
	}

	@Test
	public void test_getAllCustomers() {
		List<Customer> custs = new ArrayList<Customer>();
		// if offset is 0 then it should return first MAX_SIZE results

		// MAX_SIZE*offset,MAX_SIZE*(offset+1)-1
		// 5*0,5*1-1=0,4 : 4 elements -> size && MAX_SIZE*(offset+1)-1 true then add in
		// new list
		// 5*1,5*2-1=5,9 :

		int start = MAX_SIZE * offset;
		int size = customers.size();
		int ends = MAX_SIZE * (offset + 1) - 1;
		for (int i = start; size <= ends && i<size; i++) {
			custs.add(customers.get(i));
		}
		System.out.println(custs);
	}

}
