package de.infomotion.kw.demo.services.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineState;
import de.infomotion.kw.demo.repository.summerwine.SummerWineStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummerWineStateService {

	@Autowired
	SummerWineStateRepository summerWineStateRepository;

	public List<SummerwineState> getSummerWineStateList() {
		List<SummerwineState> summerwineStateList = summerWineStateRepository.findAll();
		return summerwineStateList;
	}
}
