package com.example.Bai1.controller;
import com.example.Bai1.entity.food;
import com.example.Bai1.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LegacyController {

    private final OrdersService orderService;

    @Autowired
    public LegacyController(OrdersService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String getAllOrders(Model model) {
        List <food> foodslist=orderService.getAllOrders();
        model.addAttribute("foodslist",foodslist);
        return "orders";
    }
    @PostMapping("/add")
    public String addFood(@ModelAttribute("newFood") food f) {
        orderService.addFood(f);
        return "redirect:/orders";
    }

//    @GetMapping("/orders/{id}")
//    @ResponseBody
//    public String getOrderById(@PathVariable Long id) {
//
//    }
}
