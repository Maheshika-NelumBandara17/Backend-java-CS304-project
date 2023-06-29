package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.model.User;
import com.cs304project.MotorTraffic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New user is added";
    }
}
