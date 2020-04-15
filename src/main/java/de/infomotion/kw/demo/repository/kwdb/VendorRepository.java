package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface VendorRepository extends JpaRepository<Vendor, BigInteger> {
}
