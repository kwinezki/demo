package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineCustomer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.math.BigInteger;

public interface SummerWineCustomerRepository extends JpaRepository<SummerwineCustomer, BigInteger>{
}
