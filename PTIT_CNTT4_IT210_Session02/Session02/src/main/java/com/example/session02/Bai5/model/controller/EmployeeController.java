package com.example.session02.Bai5.model.controller;

import com.example.session02.Bai5.model.entity.*;
import com.example.session02.Bai5.model.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    private boolean checkLogin(HttpSession session) {
        return session.getAttribute("loggedUser") != null;
    }

    @GetMapping
    public String listEmployees(HttpSession session, Model model) {
        if(!checkLogin(session)) return "redirect:/login";

        model.addAttribute("employees", service.getAllEmployees());
        model.addAttribute("totalTechSalary", service.getTotalSalaryByDepartment("Kỹ thuật"));
        return "employees";
    }

    @GetMapping("/{code}")
    public String employeeDetail(@PathVariable String code, HttpSession session, Model model) {
        if(!checkLogin(session)) return "redirect:/login";

        Employee emp = service.getByCode(code);
        if(emp == null) throw new RuntimeException("Nhân viên [" + code + "] không tồn tại trong hệ thống");

        model.addAttribute("employee", emp);
        return "employeeDetail";
    }
}