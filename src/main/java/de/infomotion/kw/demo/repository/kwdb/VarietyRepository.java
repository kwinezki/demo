package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Variety;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VarietyRepository extends JpaRepository<Variety, String> {
}
