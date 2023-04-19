package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.dto.LoginRequestDTO;
import com.cs304project.MotorTraffic.dto.ResponseLoginDTO;
import com.cs304project.MotorTraffic.model.Users;
import com.cs304project.MotorTraffic.repository.LoginRepository;
import com.cs304project.MotorTraffic.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public ResponseLoginDTO login(LoginRequestDTO loginRequestDTO) {
        ResponseLoginDTO newLoginResponse = new ResponseLoginDTO();

        // verify user exist with given email and password
        Users user = loginRepository.findOneByNicIgnoreCaseAndPassword(loginRequestDTO.getNic(), loginRequestDTO.getPassword());

        if (user == null) {
            newLoginResponse.setMessage("User login failed");
            newLoginResponse.setDate(DateUtil.getCurrentDateTime());
            newLoginResponse.setRole(String.valueOf(0));
            newLoginResponse.setNic(String.valueOf(0));


        } else {
            newLoginResponse.setMessage("User logged in");
            newLoginResponse.setDate(DateUtil.getCurrentDateTime());
            newLoginResponse.setRole((String) user.getRole());
            newLoginResponse.setNic(user.getNic());
        }
        return newLoginResponse;
    }
}
