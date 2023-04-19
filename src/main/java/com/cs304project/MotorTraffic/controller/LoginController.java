package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.dto.LoginRequestDTO;
import com.cs304project.MotorTraffic.dto.ResponseLoginDTO;
import com.cs304project.MotorTraffic.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("/user/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping//sending data from frontend to backend
    public ResponseEntity<ResponseLoginDTO> login(@RequestBody LoginRequestDTO loginRequestDTO ){

        return ResponseEntity.ok(loginService.login(loginRequestDTO));

    }
//    @GetMapping("/privateApi")
//    public ResponseEntity<ResponseLoginDTO> privateApi(@RequestHeader(value = "authorization", defaultValue = "") String auth) throws Exception {
//        ResponseLoginDTO apiResponse =new ResponseLoginDTO();
//
////        jwtUtils.verify(auth);
//
//        apiResponse.setMessage("this is private api");
//        return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
//    }
}

