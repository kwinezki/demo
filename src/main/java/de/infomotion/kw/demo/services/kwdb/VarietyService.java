package de.infomotion.kw.demo.services.kwdb;

import de.infomotion.kw.demo.model.kwdb.Variety;
import de.infomotion.kw.demo.repository.kwdb.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyService {

	private List<Variety> varietyList;

	@Autowired
	VarietyRepository varietyRepository;

	public void saveVarietys() {
		varietyRepository.saveAll(varietyList);
	}

	public void setVarietyList(List<Variety> varietyList) {
		this.varietyList = varietyList;
	}
}
