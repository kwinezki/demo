package de.infomotion.kw.demo.controller;

import de.infomotion.kw.demo.dto.CustomerDto;
import de.infomotion.kw.demo.model.kwdb.Customer;
import de.infomotion.kw.demo.services.CustomerComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerComponent customerComponent;

	public CustomerRestController(CustomerComponent customerComponent) {
	}

	@GetMapping("/get-customers")
	public CustomerDto getCustomers(){
		List<Customer> customerList = customerComponent.loadCustomerFromKwDb();

		CustomerDto customerDto = new CustomerDto(customerList);

		return customerDto;
	}



}
