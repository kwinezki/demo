package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.kwdb.Department;
import de.infomotion.kw.demo.model.kwdb.Order;
import de.infomotion.kw.demo.model.summerwine.SummerwineOrder;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    private List<SummerwineOrder> summerwineOrderList;
    private List<Order> orderList = new ArrayList<>();

    public OrderDto(List<SummerwineOrder> summerwineOrderList) {
        this.summerwineOrderList = summerwineOrderList;
    }

    public void transferObject() {
        summerwineOrderList.forEach(summerwineOrder -> {
            Order order = new Order();
            order.setOrderNumber(summerwineOrder.getOrderNumber());
            order.setCustomerNumber(summerwineOrder.getCustomerNumber());
            order.setProductNumber(summerwineOrder.getProductNumber());
            order.setVendorNumber(summerwineOrder.getVendorNumber());
            order.setQuantity(summerwineOrder.getQuantity());
            order.setDate(summerwineOrder.getDate());
            order.setWholeSalePrice(summerwineOrder.getWholeSalePrice());
            order.setWholeBuyPrice(summerwineOrder.getWholeBuyPrice());

            orderList.add(order);

        });
    }

    public List<Order> getOrderList() {
        return orderList;
    }

}


