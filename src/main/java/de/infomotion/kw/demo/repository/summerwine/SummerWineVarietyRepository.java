package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineVariety;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummerWineVarietyRepository extends JpaRepository<SummerwineVariety, String> {
}
