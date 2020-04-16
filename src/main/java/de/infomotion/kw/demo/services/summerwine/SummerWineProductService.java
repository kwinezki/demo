package de.infomotion.kw.demo.services.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineProduct;
import de.infomotion.kw.demo.repository.summerwine.SummerWineProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummerWineProductService {

	@Autowired
	SummerWineProductRepository summerWineProductRepository;

	public List<SummerwineProduct> getSummerWineProductList() {
		List<SummerwineProduct> summerwineProductList = summerWineProductRepository.findAll();
		return summerwineProductList;
	}
}
