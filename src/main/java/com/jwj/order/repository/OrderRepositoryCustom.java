package com.jwj.order.repository;

import com.jwj.order.domain.Order;

import java.util.List;

public interface OrderRepositoryCustom {

	List<Order> findOrders(OrderSearch orderSearch);
	List<Order> findAllByString(OrderSearch orderSearch);

}
