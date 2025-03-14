package com.jwj.order.repository;

import com.jwj.order.domain.Order;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

	private final EntityManager em;

	@Override
	public List<Order> findOrders(OrderSearch orderSearch) {
		return findAllByString(orderSearch);
	}

	@Override
	public List<Order> findAllByString(OrderSearch orderSearch) {
		return em.createQuery("SELECT o FROM Order o WHERE o.status = :status", Order.class)
				.setParameter("status", orderSearch.getOrderStatus())
				.getResultList();
	}
}
