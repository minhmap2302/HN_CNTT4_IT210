package com.example.Bai1.service;

import com.example.Bai1.entity.food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Bai1.reposity.OrdersReposity;

import java.util.List;

@Service
public class OrdersService {

    private final OrdersReposity orderRepository;

    @Autowired
    public OrdersService(OrdersReposity orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<food> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public food getOrderById(int id) {
        return orderRepository.getOrderById(id);
    }
    public void addFood(food f) {
        orderRepository.addfood(f);
    }
}