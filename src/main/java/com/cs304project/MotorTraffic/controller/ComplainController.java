package com.cs304project.MotorTraffic.controller;


import com.cs304project.MotorTraffic.model.Complain;
import com.cs304project.MotorTraffic.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
//@RequestMapping("/api/v1")
public class ComplainController {

    @Autowired
    private ComplainService complainService;


    @PostMapping("user/upload")
    public Complain createComplain(@RequestParam("video") MultipartFile video,
                              @RequestParam("firstName") String firstName,
                              @RequestParam("district") String district,
                              @RequestParam("phone") String phone,
                              @RequestParam("nic_num") String nic_num) throws IOException{

    return complainService.createComplain( video, firstName, district, phone,nic_num);
}

@GetMapping("/user/seevideos")
    public List<Complain> getAllComplains(){
        return complainService.getAllComplains();
    }
}
