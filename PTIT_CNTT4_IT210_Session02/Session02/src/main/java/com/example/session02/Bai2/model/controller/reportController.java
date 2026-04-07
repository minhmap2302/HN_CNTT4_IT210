package com.example.session02.Bai2.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class reportController {
    @GetMapping("/report")
    public String Showmodel(Model model){
        List<String>item= Arrays.asList("item1","item2","item3");
        model.addAttribute("items",item);
        return "report";
    }

}
