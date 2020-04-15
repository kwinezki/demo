package de.infomotion.kw.demo.services;

import de.infomotion.kw.demo.model.kwdb.Country;
import de.infomotion.kw.demo.repository.kwdb.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class CountryComponent {

	private List<Country> countryList;

	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public void saveCountries() {
		System.out.println("In saveCountries " + countryList);
		System.out.println(countryRepository);
		countryRepository.saveAll(countryList);
	}


}
