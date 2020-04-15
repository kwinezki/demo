package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Customer;
import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


public class KwDbCustomerRepositoryImpl implements KwDbCustomerRepository {

   @PersistenceContext
   private EntityManager entityManager;

    @Transactional
    @Override
    public void save(List<SummerwineCustomer> summerwineCustomer) {
        int batchSize = 10;
        int entityCount = summerwineCustomer.size();


           for (int i = 0; i < entityCount; i++) {
                  Customer customer = new Customer (
                        summerwineCustomer.get(i).getCustomerNumber(),
                        summerwineCustomer.get(i).getCustomerName(),
                        summerwineCustomer.get(i).getZipCode(),
                        summerwineCustomer.get(i).getCity(),
                        summerwineCustomer.get(i).getStreetName(),
                        summerwineCustomer.get(i).getFederalStateShortCode(),
                        summerwineCustomer.get(i).getStateShortCode()
               );

                    entityManager.persist(customer);

           }

       }

    @Transactional
    @Override
    public void refresh(Customer customer) {
           entityManager.refresh(customer);
    }
}



