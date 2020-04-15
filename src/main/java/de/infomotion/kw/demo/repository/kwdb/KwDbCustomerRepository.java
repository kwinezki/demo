package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Customer;
import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;

import java.util.List;

public interface KwDbCustomerRepository {
    void save(List<SummerwineCustomer> summerwineCustomers);
    void refresh(Customer customer);
}
