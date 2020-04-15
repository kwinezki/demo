package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SummerWineProductRepository extends JpaRepository<SummerwineProduct, BigInteger> {
}
