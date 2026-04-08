package com.restaurant.bai5.repository;

import com.restaurant.bai5.model.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class OrderRepository {

    private final Map<Long, Order> orders = new HashMap<>();
    private long currentId = 1;

    public Order save(Order order) {
        order.setId(currentId++);
        orders.put(order.getId(), order);
        return order;
    }


    public Optional<Order> findById(Long id) {
        return Optional.ofNullable(orders.get(id));
    }

    public boolean deleteById(Long id) {
        return orders.remove(id) != null;
    }
}