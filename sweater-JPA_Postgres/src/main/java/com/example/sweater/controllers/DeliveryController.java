package com.example.sweater.controllers;

import com.example.sweater.domain.Delivery;
import com.example.sweater.domain.Selling;
import com.example.sweater.repos.DeliveryRepo;
import com.example.sweater.repos.SellingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
@Controller
public class DeliveryController {
    @Autowired
    DeliveryRepo deliveryRepo;
    @GetMapping("/delivery")
    public String deliveries(Map<String, Object> model) {
        List<Delivery> deliveries = deliveryRepo.findAll();
        model.put("deliveries", deliveries);
        return "delivery";
    }
}
