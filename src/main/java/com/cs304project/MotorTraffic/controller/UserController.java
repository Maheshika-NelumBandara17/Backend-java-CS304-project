package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.dto.UserDto;
import com.cs304project.MotorTraffic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
//@RequestMapping("api/v2/open")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public void addUser(@RequestBody UserDto userDto){
        userService.createNewUser(userDto);
    }


    @PutMapping("/update/{email}")
    public boolean updateUserDetails(@PathVariable String email, @RequestBody  UserDto userDto){
        userService.updateUserDetails(
                email,
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAddress(),
                userDto.getPhone(),
                userDto.getDistrict()

        );
        return true;
    }







}
