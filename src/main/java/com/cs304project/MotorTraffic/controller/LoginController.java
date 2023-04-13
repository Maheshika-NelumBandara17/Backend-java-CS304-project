package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.dto.LoginDto;
import com.cs304project.MotorTraffic.security.UserDetailsImpl;
import com.cs304project.MotorTraffic.service.JwtLoginService;
import com.cs304project.MotorTraffic.response.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtLoginService jwtLoginService;

    @PostMapping("/authenticate/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginDto dto)  {


        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getNic(), dto.getPassword()));
        if(authenticate.isAuthenticated()){


            return ResponseEntity.ok(jwtLoginService.generateToken(dto.getNic()));
            //return jwtLoginService.generateToken(dto.getNic());


        }else {
            throw new UsernameNotFoundException("user name or password is wrong");
        }
    }
}



