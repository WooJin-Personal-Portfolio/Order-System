package com.jwj.order.repository;

import com.jwj.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long>, OrderRepositoryCustom {

    List<Order> findAllByString(OrderSearch orderSearch);
}

