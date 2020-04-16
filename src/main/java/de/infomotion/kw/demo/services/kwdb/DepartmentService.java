package de.infomotion.kw.demo.services.kwdb;

import de.infomotion.kw.demo.model.kwdb.Department;
import de.infomotion.kw.demo.repository.kwdb.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class DepartmentService {

	private List<Department> departmentList;

	@Autowired
	DepartmentRepository departmentRepository;

	@Transactional
	public void saveDepartments() {
		departmentRepository.saveAll(departmentList);
	}


	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

}
