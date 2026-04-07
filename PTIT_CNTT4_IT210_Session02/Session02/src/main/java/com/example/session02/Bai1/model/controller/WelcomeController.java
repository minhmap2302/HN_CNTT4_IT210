package com.example.session02.Bai1.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String showWelcome(Model model) {
        String employeeName = "Nguyen Van A";
        model.addAttribute("name", employeeName);

        return "welcome";
    }
}