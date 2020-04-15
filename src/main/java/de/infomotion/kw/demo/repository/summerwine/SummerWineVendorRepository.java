package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SummerWineVendorRepository extends JpaRepository<SummerwineVendor, BigInteger> {
}
