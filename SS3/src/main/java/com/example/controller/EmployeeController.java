package com.example.controller;

import com.example.model.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/employees";
    }

    @GetMapping("/employees")
    public String showEmployeeList(Model model) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Nguyễn Văn A", "Đào tạo", 12000));
        employeeList.add(new Employee(2, "Trần Thị B", "Đào tạo", 8500));
        employeeList.add(new Employee(3, "Lê Văn C", "Đào tạo", 15000));

        model.addAttribute("employees", employeeList);

        return "employee-list";
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Nguyễn Văn A", "Đào tạo", 12000));
        employeeList.add(new Employee(2, "Trần Thị B", "Đào tạo", 8500));
        employeeList.add(new Employee(3, "Lê Văn C", "Đào tạo", 15000));

        StringBuilder csv = new StringBuilder();
        csv.append("ID,Full Name,Department,Salary\n");
        for (Employee emp : employeeList) {
            csv.append(emp.getId()).append(",")
                .append(emp.getFullName()).append(",")
                .append(emp.getDepartment()).append(",")
                .append(emp.getSalary()).append("\n");
        }

        byte[] csvBytes = csv.toString().getBytes();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDisposition(org.springframework.http.ContentDisposition.attachment()
                .filename("employees.csv")
                .build());

        return ResponseEntity.ok()
                .headers(headers)
                .body(csvBytes);
    }
}