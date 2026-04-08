package com.restaurant.bai5.controller;

import com.restaurant.bai5.exception.InvalidOrderIdException;
import com.restaurant.bai5.model.Order;
import com.restaurant.bai5.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Xem đơn hàng
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable String id) {
        try {
            Long orderId = Long.parseLong(id);
            Optional<Order> order = orderService.getOrder(orderId);
            return order.orElseThrow(() -> new InvalidOrderIdException("Không tìm thấy đơn hàng với ID: " + id));
        } catch (NumberFormatException e) {
            throw new InvalidOrderIdException("ID đơn hàng phải là một số");
        }
    }

    // Tạo đơn hàng
    @PostMapping
    public Order createOrder(@RequestParam String description) {
        return orderService.createOrder(description);
    }

    // Hủy đơn hàng
    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable String id) {
        try {
            Long orderId = Long.parseLong(id);
            boolean deleted = orderService.cancelOrder(orderId);
            return deleted ? "Đơn hàng đã được hủy" : "Đơn hàng không tồn tại";
        } catch (NumberFormatException e) {
            throw new InvalidOrderIdException("ID đơn hàng phải là một số");
        }
    }
}