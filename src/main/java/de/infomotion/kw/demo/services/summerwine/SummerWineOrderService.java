package de.infomotion.kw.demo.services.summerwine;

import de.infomotion.kw.demo.model.summerwine.SummerwineOrder;
import de.infomotion.kw.demo.repository.summerwine.SummerWineOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SummerWineOrderService {

	@Autowired
	SummerWineOrderRepository summerWineOrderRepository;

	public List<SummerwineOrder> getSummerwineOrderList () {
		List<SummerwineOrder> summerwineOrderList = summerWineOrderRepository.findAll();
		return summerwineOrderList;
	}
}
