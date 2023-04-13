package com.cs304project.MotorTraffic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/open")
public class OpenApis {

    @GetMapping("/demo")
    public String demoOpenApi(){
        return "open Api";
   }
}
