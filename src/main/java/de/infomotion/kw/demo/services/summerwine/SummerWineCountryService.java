package de.infomotion.kw.demo.services.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineCountry;
import de.infomotion.kw.demo.repository.summerwine.SummerWineCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SummerWineCountryService {

	@Autowired
	SummerWineCountryRepository summerWineCountryRepository;

	public List<SummerwineCountry> getSummerwineCountryList () {
		List<SummerwineCountry> summerwineCountryList = summerWineCountryRepository.findAll();
		return summerwineCountryList;
	}
}
