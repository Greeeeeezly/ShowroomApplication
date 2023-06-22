package com.example.sweater.controllers;

import com.example.sweater.domain.Selling;
import com.example.sweater.repos.SellingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class SellingController {
    @Autowired
    SellingRepo sellingRepo;
    @GetMapping("/sellings")
    public String sellings(Map<String, Object> model) {
        List<Selling> sellings = sellingRepo.findAll();
        model.put("sellings", sellings);

        return "sellings";
    }
    @PostMapping("/filter")
    public String selling_by_id(@RequestParam(required = false) Integer id, Map<String, Object> model){
        List<Selling> sellings;
        List<Selling> sellingsById = new ArrayList<>();
        Integer currentId;
        sellings = sellingRepo.findAll();
        if (!(id == null)) {
            for (Selling selling : sellings) {
                currentId = selling.getId();
                if (currentId.equals(id)) {
                    sellingsById.add(selling);
                }
            }
            model.put("sellings",sellingsById);
        } else {
            model.put("sellings",sellings);
        }
        return "sellings";
    }
}
