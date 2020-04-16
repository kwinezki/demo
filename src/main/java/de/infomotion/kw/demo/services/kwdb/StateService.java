package de.infomotion.kw.demo.services.kwdb;

import de.infomotion.kw.demo.model.kwdb.State;
import de.infomotion.kw.demo.repository.kwdb.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

	private List<State> stateList;

	@Autowired
	StateRepository stateRepository;

	public void saveStates() {
		stateRepository.saveAll(stateList);
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
}
