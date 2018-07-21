package com.sharma.nk.cm;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharma.nk.cm.models.Customer;
import com.sharma.nk.cm.svcs.CustomerRepositoryImpl;

@RestController
@RequestMapping("/custs")
public class CustomerRestController {

	private static final Logger log = LoggerFactory.getLogger(CustomerRestController.class);

	@Autowired
	CustomerRepositoryImpl crepo;

	@PostMapping("/cust")
	public String addNewCustomer(@RequestBody Customer customer) {
		log.info("START : addNewCustomer");

		Customer c = crepo.save(customer);

		log.info("END: new customer added with cid {}", c.getCid());

		return c.getCid();
	}

	@GetMapping(value = "/cust/{cid}")
	public Customer findCustomerById(@PathVariable("cid") String cid) {
		log.info("START : findCustomerById({})", cid);

		Customer cust = crepo.findById(cid).orElse(null);

		log.info("END : customer found: {}", cust);

		return cust;
	}

	@GetMapping(value = "/{page}")
	public List<Customer> getCustomersByPagination(@PathVariable(name = "page", required = false) int page) {
		log.info("START : getCustomersByPagination({})", page);

		Page<Customer> pages = crepo.findAll(PageRequest.of(page, 5));
		List<Customer> custs = new ArrayList<>();
		for (Customer c : pages) {
			custs.add(c);
		}
		log.debug("Returning {} customers", custs.size());
		return custs;
	}

}
