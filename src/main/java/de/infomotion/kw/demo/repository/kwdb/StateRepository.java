package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, String> {
}
