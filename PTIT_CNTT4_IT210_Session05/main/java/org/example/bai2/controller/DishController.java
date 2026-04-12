package org.example.bai2.controller;

import org.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {
    private final FoodService foodService;
    @Autowired
    public DishController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/dish")
    public String home(Model model){
        model.addAttribute("dishlist",foodService.getalldish());
        return "dishlist";
    }

}
