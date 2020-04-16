package de.infomotion.kw.demo.services.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineVendor;
import de.infomotion.kw.demo.repository.summerwine.SummerWineVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummerWineVendorService {

	@Autowired
	SummerWineVendorRepository summerWineVendorRepository;

	public List<SummerwineVendor> getSummerWineVendorList() {
		List<SummerwineVendor> summerwineVendorList = summerWineVendorRepository.findAll();
		return summerwineVendorList;
	}
}
