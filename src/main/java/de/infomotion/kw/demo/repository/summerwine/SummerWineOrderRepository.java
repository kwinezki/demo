package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SummerWineOrderRepository extends JpaRepository<SummerwineOrder, BigInteger> {
}
