package de.infomotion.kw.demo.services;

import de.infomotion.kw.demo.dto.SummerWineCountryDto;
import de.infomotion.kw.demo.model.summerwine.SummerwineCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ServiceHandler {

	@Autowired
	SummerWineCountryService summerWineCountryService;

	@Autowired
	CustomerComponent customerComponent;

	@Autowired
	CountryComponent countryComponent;


	@Transactional
	@EventListener(value = ApplicationReadyEvent.class)
	public void onStartup() {

		copyCountries();
		copyCustomer();
	}

	private void copyCustomer() {
		customerComponent.copyCustomers();
	}

	private void copyCountries() {

		List<SummerwineCountry> summerwineCountryList = summerWineCountryService.getSummerwineCountryList();

		SummerWineCountryDto summerwineCountryDto = new SummerWineCountryDto(summerwineCountryList);
		summerwineCountryDto.transferObject();
		countryComponent.setCountryList(summerwineCountryDto.getCountryList());
		countryComponent.saveCountries();

		//@ToDo: Debuggen
	}


}
