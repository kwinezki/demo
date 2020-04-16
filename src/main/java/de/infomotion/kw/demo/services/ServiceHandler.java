package de.infomotion.kw.demo.services;

import de.infomotion.kw.demo.dto.CountryDto;
import de.infomotion.kw.demo.dto.DepartmentDto;
import de.infomotion.kw.demo.model.summerwine.SummerwineCountry;
import de.infomotion.kw.demo.model.summerwine.SummerwineDepartment;
import de.infomotion.kw.demo.services.kwdb.CountryService;
import de.infomotion.kw.demo.services.kwdb.CustomerService;
import de.infomotion.kw.demo.services.kwdb.DepartmentService;
import de.infomotion.kw.demo.services.summerwine.SummerWineCountryService;
import de.infomotion.kw.demo.services.summerwine.SummerWineDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceHandler {

	//Country
	@Autowired SummerWineCountryService summerWineCountryService;
	@Autowired CountryService countryService;

	//Customer
	@Autowired CustomerService customerService;

	//Department
	@Autowired SummerWineDepartmentService summerWineDepartmentService;
	@Autowired DepartmentService departmentService;

	//Eventlistener
	@Transactional
	@EventListener(value = ApplicationReadyEvent.class)
	public void onStartup() {

		//copyCountries();
		//copyCustomer();
		copyDepartments();
	}

	//Methoden
	private void copyDepartments() {
		List<SummerwineDepartment> summerwineDepartmentList = summerWineDepartmentService.getSummerwineDepartmentList();

		DepartmentDto departmentDto = new DepartmentDto(summerwineDepartmentList);
		departmentDto.transferObject();

		departmentService.setDepartmentList(departmentDto.getDepartmentList());
		departmentService.saveDepartments();
	}

	private void copyCustomer() {
		customerService.copyCustomers();
	}

	private void copyCountries() {

		List<SummerwineCountry> summerwineCountryList = summerWineCountryService.getSummerwineCountryList();

		CountryDto summerwineCountryDto = new CountryDto(summerwineCountryList);
		summerwineCountryDto.transferObject();
		countryService.setCountryList(summerwineCountryDto.getCountryList());
		countryService.saveCountries();

		//@ToDo: Debuggen
	}


}
