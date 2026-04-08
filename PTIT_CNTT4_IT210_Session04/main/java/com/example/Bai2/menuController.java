package com.example.Bai2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class menuController {
    @GetMapping("/menu")
    public String getMenu(@RequestParam("category") String category, Model model) {
        model.addAttribute("category",category);
        return "menu";
    }
}
