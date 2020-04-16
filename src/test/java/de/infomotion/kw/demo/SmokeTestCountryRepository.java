package de.infomotion.kw.demo;

import de.infomotion.kw.demo.repository.kwdb.CountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SmokeTestCountryRepository {

	@Autowired
	CountryRepository countryRepository;

	@Test
	void contextLoads() throws Exception{
		assertThat(countryRepository).isNotNull();
	}
}
