package com.example.sweater.controllers;

import com.example.sweater.domain.CarShowroom;
import com.example.sweater.repos.ShowroomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ShowroomController {
    @Autowired
    private ShowroomRepo showroomRepo;

    @GetMapping("/showrooms")
    public String main(Map<String, Object> model) {
        List<CarShowroom> showrooms = showroomRepo.findAll();
        model.put("showrooms", showrooms);

        return "showrooms";
    }
    @PostMapping("/showrooms")
    public String addShowroom(@RequestParam String address, @RequestParam Integer area, @RequestParam String city, @RequestParam String email,@RequestParam String phone, Map<String, Object> model) {
        CarShowroom carShowroom = new CarShowroom(area,address,city,email,phone);

        showroomRepo.save(carShowroom);

        return "redirect:/showrooms";
    }
    @PostMapping("/deleteShowroom")
    public String deleteShowroom(@RequestParam("showroom_id") Integer showroom_id) {
        List<CarShowroom> carShowroom = showroomRepo.findByShowroomId(showroom_id);

        if (carShowroom != null && carShowroom.size()>0) {
            showroomRepo.delete(carShowroom.get(0));
        }
        return "redirect:/showrooms";
    }
    @PostMapping("/updateShowroom")
    public String updateShowroom(
            @RequestParam("showroom_id") Integer showroomId,
            @RequestParam("address") String address,
            @RequestParam("area") Integer area,
            @RequestParam("city") String city,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone
    ) {
        List<CarShowroom> showrooms = showroomRepo.findByShowroomId(showroomId);
        if (!showrooms.isEmpty()) {
            CarShowroom carShowroom = showrooms.get(0);
            carShowroom.setAddress(address);
            carShowroom.setArea(area);
            carShowroom.setCity(city);
            carShowroom.setEmail(email);
            carShowroom.setPhone(phone);
            showroomRepo.save(carShowroom);
        }
        return "redirect:/showrooms";
    }


}
