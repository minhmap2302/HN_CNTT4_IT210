package com.example.session02.Bai5.model.service;

import com.example.session02.Bai5.model.entity.*;
import com.example.session02.Bai5.model.entity.Employee;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class EmployeeService {

    private final Map<String, Employee> employees = new LinkedHashMap<>();

    public EmployeeService() {
        employees.put("NV001", new Employee("NV001", "Nguyễn Thị Lan", "Kế toán", 15000000, LocalDate.of(2020,3,1), "Đang làm"));
        employees.put("NV002", new Employee("NV002", "Trần Văn Hùng", "Kỹ thuật", 25000000, LocalDate.of(2019,7,15), "Đang làm"));
        employees.put("NV003", new Employee("NV003", "Lê Minh Đức", "Kinh doanh", 18500000, LocalDate.of(2021,11,20), "Nghỉ phép"));
        employees.put("NV004", new Employee("NV004", "Phạm Thu Hương", "Kỹ thuật", 22000000, LocalDate.of(2022,1,5), "Đang làm"));
        employees.put("NV005", new Employee("NV005", "Hoàng Văn Nam", "Kế toán", 12000000, LocalDate.of(2023,6,10), "Thử việc"));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public Employee getByCode(String code) {
        return employees.get(code);
    }

    public double getTotalSalaryByDepartment(String dept) {
        return employees.values().stream()
                .filter(e -> e.getDepartment().equals(dept))
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
