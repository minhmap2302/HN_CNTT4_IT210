package com.example.session02.Bai3.model.Controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class OrderController {

    @GetMapping("/orders")
    public String orders(HttpSession session, Model model) {

        String user = (String) session.getAttribute("loggedUser");
        String role = (String) session.getAttribute("role");

        if(user == null) {
            return "redirect:/login";
        }


        List<Map<String,Object>> orders = new ArrayList<>();
        orders.add(Map.of("id", "DH001", "product", "Laptop Dell", "total", 15000000, "date", new Date()));
        orders.add(Map.of("id", "DH002", "product", "Chuột Logitech", "total", 500000, "date", new Date()));
        orders.add(Map.of("id", "DH003", "product", "Bàn phím cơ", "total", 1200000, "date", new Date()));

        model.addAttribute("orders", orders);
        model.addAttribute("loggedUser", user);
        model.addAttribute("role", role);
        ServletContext app = session.getServletContext();
        synchronized (app) {
            Integer count = (Integer) app.getAttribute("totalViewCount");
            if(count == null) count = 0;
            count++;
            app.setAttribute("totalViewCount", count);
        }

        return "orders";
    }
}