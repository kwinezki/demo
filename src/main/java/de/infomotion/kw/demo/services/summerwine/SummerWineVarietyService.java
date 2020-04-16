package de.infomotion.kw.demo.services.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineVariety;
import de.infomotion.kw.demo.repository.summerwine.SummerWineVarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummerWineVarietyService {

	@Autowired
	SummerWineVarietyRepository summerWineVarietyRepository;

	public List<SummerwineVariety> getSummerWineVarietList() {
		List<SummerwineVariety> summerwineVarietyList = summerWineVarietyRepository.findAll();
		return summerwineVarietyList;
	}
}
