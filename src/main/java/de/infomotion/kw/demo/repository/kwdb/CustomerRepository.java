package de.infomotion.kw.demo.repository.kwdb;

        import de.infomotion.kw.demo.model.kwdb.Customer;
        import org.hibernate.annotations.Where;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.math.BigInteger;
        import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, BigInteger>, CustomCustomerRepository {

}
