package de.infomotion.kw.demo.services;

import de.infomotion.kw.demo.model.kwdb.Customer;
import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;
import de.infomotion.kw.demo.repository.kwdb.KwDbRepository;
import de.infomotion.kw.demo.repository.summerwine.SummerWineRepository;
import de.infomotion.kw.demo.dto.SummerwineCustomerDto;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class CustomerService {

    @Autowired
    KwDbRepository kwDbRepository;

    @Autowired
    SummerWineRepository summerWineRepository;

    @Transactional
    @EventListener(value = ApplicationReadyEvent.class)
    public void onStartup() {                               //Die Datenbank wird bei Start der Applikation gestartet, dass soll jetzt durch den Controller erfolgen

       // loadCustomerFromKwDb();
       // loadCustomerFromSummerWine();
        copyCustomers();
    }

    private void copyCustomers() {
        List<SummerwineCustomer> summerwineCustomerList = summerWineRepository.findAll();
        SummerwineCustomerDto summerwineCustomerDto = new SummerwineCustomerDto(summerwineCustomerList);
        kwDbRepository.save(summerwineCustomerDto.getSummerwineCustomers());
    }

    @Transactional
    public List<Customer> loadCustomerFromKwDb(){
        List<Customer> customerList = kwDbRepository.findAll();
        customerList.forEach(customer1 -> System.out.println(customer1));
        return customerList;
    }

    @Transactional
    public void loadCustomerFromSummerWine(){
        List<SummerwineCustomer> summerwineCustomerList = summerWineRepository.findAll();
        summerwineCustomerList.forEach(summerwineCustomer -> System.out.println(summerwineCustomer));

    }

}
