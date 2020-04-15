package de.infomotion.kw.demo.repository.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface SummerWineDepartmentRepository extends JpaRepository<SummerwineDepartment, BigInteger> {
}
