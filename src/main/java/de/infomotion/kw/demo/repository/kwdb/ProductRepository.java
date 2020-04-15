package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ProductRepository extends JpaRepository<Product, BigInteger> {
}
