package com.example.sweater.controllers;

import com.example.sweater.domain.Car;
import com.example.sweater.domain.Selling;
import com.example.sweater.repos.CarRepo;
import com.example.sweater.repos.SellingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class CarController {
    @Autowired
    CarRepo carRepo;
    @GetMapping("/cars")
    public String sellings(Map<String, Object> model) {
        Iterable<Car> cars = carRepo.findAll();
        model.put("cars", cars);

        return "cars";
    }
}
