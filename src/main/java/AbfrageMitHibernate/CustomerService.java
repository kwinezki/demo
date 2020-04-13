package AbfrageMitHibernate;

import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


//@Component
public class CustomerService {
/*
    @PersistenceContext
    private EntityManager entityManager;

    /* @Transactional */
  /*  @EventListener(value = ApplicationReadyEvent.class)
    public void onStartup() {                               //Die Datenbank wird bei Start der Applikation gestartet, dass soll jetzt durch den Controller erfolgen

        //loadFromDatabase();
        //loadFirstNames();
        loadNamesBauer();
    }

    @Transactional
    public List<Customer> loadCustomerBauer(){
        List<Customer> customerList = entityManager.createQuery("SELECT c FROM Customer c WHERE c.lastName = 'Bauer'").getResultList();
        return customerList;
    }

    /*
    @Transactional
    private void loadNamesBauer() {
        List<Object[]> list = entityManager.createQuery("SELECT c.firstName, c.lastName FROM Customer c WHERE c.lastName = 'Bauer'").getResultList();
       for (Object[] obj : list) {
           System.out.println(obj[0]+" "+obj[1]);
       }
        list.forEach(objects -> System.out.println(objects[0] + " " + objects[1]));
    }

    @Transactional
    private void loadFromDatabase() {

        List<Customer> customerList= entityManager.createQuery("SELECT c FROM Customer c").getResultList();
        customerList.forEach(customer -> System.out.println(customer));
        customerList.forEach(customer -> System.out.println(customer.getLastName() + ", " + customer.getFirstName()));


    }

    @Transactional
    private void loadFirstNames() {
        List<String> customerFirstNames = entityManager.createQuery("SELECT c.firstName FROM Customer c").getResultList();
        customerFirstNames.forEach(s -> System.out.println(s));
    }
    */
}