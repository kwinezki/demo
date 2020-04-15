package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummerWineCountryRepository extends JpaRepository<SummerwineCountry, String> {
}
