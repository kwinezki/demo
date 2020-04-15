package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
