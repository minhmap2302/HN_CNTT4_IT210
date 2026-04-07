package com.example.session02.Bai4.model.controoler;

import com.example.session02.Bai4.model.entity.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class SearchController {

    private static final List<Event> ALL_EVENTS = List.of(
            new Event(1, "Spring Framework Workshop", "10/04/2026", 0, 20),
            new Event(2, "Java Basics Bootcamp", "12/04/2026", 500_000, 5),
            new Event(3, "Advanced Spring Boot", "15/04/2026", 1_200_000, 0),
            new Event(4, "Microservices with Spring", "18/04/2026", 800_000, 8)
    );

    @GetMapping("search")
    public String searchEvents(
            @RequestParam(name = "keyword", required = false, defaultValue = "") String keyword,
            Model model) {

        String lowerKeyword = keyword.toLowerCase();

        List<Event> filtered = ALL_EVENTS.stream()
                .filter(e -> e.getName().toLowerCase().contains(lowerKeyword))
                .collect(Collectors.toList());

        model.addAttribute("events", filtered);
        model.addAttribute("keyword", keyword);

        return "search";
    }
}