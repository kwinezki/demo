package de.infomotion.kw.demo;

import de.infomotion.kw.demo.model.kwdb.Department;
import de.infomotion.kw.demo.services.kwdb.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SmokeTestDepartmentService {

	@Autowired
	private DepartmentService departmentService;

	@Test
	void contextLoads() throws Exception{
		assertThat(departmentService).isNotNull();
	}

}
