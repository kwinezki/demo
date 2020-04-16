package de.infomotion.kw.demo.services.summerwine;


import de.infomotion.kw.demo.model.summerwine.SummerwineDepartment;
import de.infomotion.kw.demo.repository.summerwine.SummerWineDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SummerWineDepartmentService {

	@Autowired
	SummerWineDepartmentRepository summerWineDepartmentRepository;

	public List<SummerwineDepartment> getSummerwineDepartmentList () {
		List<SummerwineDepartment> summerwineDepartmentList = summerWineDepartmentRepository.findAll();
		return summerwineDepartmentList;
	}
}
