
package com.befine.controller;

import com.befine.model.TaskItem;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class TaskController {

    private List<TaskItem> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public String list(Model model) {
        model.addAttribute("tasks", tasks);
        return "task-list";
    }

    @GetMapping("/tasks/new")
    public String form(Model model) {
        model.addAttribute("taskItem", new TaskItem());
        return "task-form";
    }

    @PostMapping("/tasks")
    public String save(@Valid @ModelAttribute("taskItem") TaskItem task,
                       BindingResult result) {
        if (result.hasErrors()) {
            return "task-form";
        }
        tasks.add(task);
        return "redirect:/tasks";
    }
}
