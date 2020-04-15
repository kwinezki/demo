package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;

import java.util.List;

public class SummerwineCustomerDto {

    private List<SummerwineCustomer> summerwineCustomers;

    public SummerwineCustomerDto(List<SummerwineCustomer> summerwineCustomers) {
        this.summerwineCustomers = summerwineCustomers;
    }

    public List<SummerwineCustomer> getSummerwineCustomers() {
        return summerwineCustomers;
    }

}


