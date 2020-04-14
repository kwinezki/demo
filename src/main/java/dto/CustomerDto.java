package dto;


import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;

import java.util.List;

public class CustomerDto {

    private List<SummerwineCustomer> summerwineCustomers;

    public CustomerDto(List<SummerwineCustomer> summerwineCustomers) {
        this.summerwineCustomers = summerwineCustomers;
    }

    public List<SummerwineCustomer> getSummerwineCustomers() {
        return summerwineCustomers;
    }

}


