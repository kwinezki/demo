package de.infomotion.kw.demo.controller;

import de.infomotion.kw.demo.dto.CustomerDto;
import de.infomotion.kw.demo.model.kwdb.Customer;
import de.infomotion.kw.demo.services.kwdb.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	public CustomerRestController(CustomerService customerService) {
	}

	@GetMapping("/get-customers")
	public CustomerDto getCustomers(){
		List<Customer> customerList = customerService.loadCustomerFromKwDb();

		CustomerDto customerDto = new CustomerDto(customerList);

		return customerDto;
	}



}
