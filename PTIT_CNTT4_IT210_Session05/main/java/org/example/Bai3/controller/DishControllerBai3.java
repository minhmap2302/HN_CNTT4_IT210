package org.example.Bai3.controller;
import org.example.model.Dish;
import org.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class DishControllerBai3 {
    private final FoodService foodService;
    @Autowired
    public DishControllerBai3(FoodService foodService) {
        this.foodService = foodService;
    }
    @GetMapping("/edit/{id}")
    public String getdishbyid(@PathVariable("id") int id,Model model){
        Dish dish=foodService.getalldish().stream().filter(e->e.getId()==id).findFirst().orElse(null);
        if (dish!=null){
            model.addAttribute("dishEdit",dish);
        }
        return "editdish";

    }
    @PostMapping("/edit/{id}")
    public String EditDish(@PathVariable("id") int id, @RequestParam("name") String name,
                           @RequestParam("status") boolean status){
        Optional<Dish> dishOptional=foodService.getalldish().stream().filter(e->e.getId()==id).findFirst();
        dishOptional.get().setName(name);
        dishOptional.get().setStatus(status);
        return "redirect:/dish";

    }
}
