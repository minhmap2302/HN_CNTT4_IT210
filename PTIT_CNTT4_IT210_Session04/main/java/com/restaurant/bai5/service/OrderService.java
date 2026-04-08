package com.restaurant.bai5.service;

import com.restaurant.bai5.model.Order;
import com.restaurant.bai5.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(String description) {
        return orderRepository.save(new Order(null, description));
    }

    public Optional<Order> getOrder(Long id) {
        return orderRepository.findById(id);
    }

    public boolean cancelOrder(Long id) {
        return orderRepository.deleteById(id);
    }
}