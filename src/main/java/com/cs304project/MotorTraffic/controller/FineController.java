package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.model.Fine;
import com.cs304project.MotorTraffic.service.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/v2/open")
@CrossOrigin
public class FineController {

    @Autowired
    private FineService fineService;

    @PostMapping("user/addfine")
    public String add(@RequestBody Fine fine) {
        fineService.saveFine(fine);
        return "new fine added";
    }
}
