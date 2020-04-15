package de.infomotion.kw.demo.dto;

import de.infomotion.kw.demo.model.kwdb.Country;
import de.infomotion.kw.demo.model.summerwine.SummerwineCountry;

import java.util.ArrayList;
import java.util.List;

public class SummerWineCountryDto {

	private List<SummerwineCountry> summerWineCountryList;
	private List<Country> countryList = new ArrayList<>();

	public SummerWineCountryDto(List<SummerwineCountry> summerWineCountryList) {
		this.summerWineCountryList = summerWineCountryList;
	}

	public void transferObject() {
		summerWineCountryList.forEach(summerwineCountry -> {
			Country country = new Country();
			country.setCountry(summerwineCountry.getCountry());
			country.setCountryShortCode(summerwineCountry.getCountryShortCode());
			countryList.add(country);
		});

	}

	public List<Country> getCountryList() {
		return countryList;
	}

}
