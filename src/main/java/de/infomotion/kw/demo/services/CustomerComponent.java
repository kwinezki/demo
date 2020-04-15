package de.infomotion.kw.demo.services;

import de.infomotion.kw.demo.model.kwdb.Customer;
import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;
import de.infomotion.kw.demo.repository.kwdb.CustomerRepository;
import de.infomotion.kw.demo.repository.summerwine.SummerWineCustomerRepository;
import de.infomotion.kw.demo.dto.SummerwineCustomerDto;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerComponent {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    SummerWineCustomerRepository summerWineCustomerRepository;

    @Transactional
    public void copyCustomers() {
        List<SummerwineCustomer> summerwineCustomerList = summerWineCustomerRepository.findAll();
        SummerwineCustomerDto summerwineCustomerDto = new SummerwineCustomerDto(summerwineCustomerList);
        customerRepository.save(summerwineCustomerDto.getSummerwineCustomers());
    }


    @Transactional
    public List<Customer> loadCustomerFromKwDb(){
        List<Customer> customerList = customerRepository.findAll();
        customerList.forEach(customer1 -> System.out.println(customer1));
        return customerList;
    }

    @Transactional
    public void loadCustomerFromSummerWine(){
        List<SummerwineCustomer> summerwineCustomerList = summerWineCustomerRepository.findAll();
        summerwineCustomerList.forEach(summerwineCustomer -> System.out.println(summerwineCustomer));

    }

}
