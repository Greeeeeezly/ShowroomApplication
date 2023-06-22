package com.example.sweater.controllers;

import com.example.sweater.domain.Employee;
import com.example.sweater.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;
    @GetMapping("/employees")
    public String getEmployees(Map<String, Object> model){
        Iterable<Employee> employees = employeeRepo.findAll();
        model.put("employees", employees);
        return "employees";
    }
}
