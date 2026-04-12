package org.example.Bai5;

import org.example.model.Order;
import org.example.service.FoodService;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class orderController {
    private final FoodService foodService;
    private final OrderService orderService;

    @Autowired
    public orderController(FoodService foodService, OrderService orderService) {
        this.foodService = foodService;
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public String home(Model model){
        model.addAttribute("dishlist",foodService.getalldish());
        return "order";
    }
    @GetMapping("/order/{id}")
    public String orderOne(@PathVariable("id") int dishId){

        Order order = new Order();
        order.setId((int)(Math.random()*1000));

        orderService.addOrder(order);


        orderService.addOderdetail(order.getId(), dishId);

        return "redirect:/order?success";
    }
}
