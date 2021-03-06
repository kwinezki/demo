package de.infomotion.kw.demo.dto;

import de.infomotion.kw.demo.model.kwdb.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDto {

	private List<Customer> customerList;

	public CustomerDto(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
}
