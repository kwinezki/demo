package de.infomotion.kw.demo.services.kwdb;

import de.infomotion.kw.demo.model.kwdb.Order;
import de.infomotion.kw.demo.repository.kwdb.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

	private List<Order> orderList;

	@Autowired
	OrderRepository orderRepository;

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public void saveOrders() {
		orderRepository.saveAll(orderList);
	}
}
