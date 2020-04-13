package de.infomotion.kw.demo.repository.kwdb;

        import de.infomotion.kw.demo.model.kwdb.Customer;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.math.BigInteger;
        import java.util.List;

public interface KwDbRepository extends JpaRepository<Customer, BigInteger> {

}
