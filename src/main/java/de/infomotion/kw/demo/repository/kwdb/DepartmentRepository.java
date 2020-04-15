package de.infomotion.kw.demo.repository.kwdb;

import de.infomotion.kw.demo.model.kwdb.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DepartmentRepository extends JpaRepository<Department, BigInteger> {
}
