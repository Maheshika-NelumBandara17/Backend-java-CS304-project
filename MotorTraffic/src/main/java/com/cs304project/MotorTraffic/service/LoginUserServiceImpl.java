package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.model.LoginUser;
import com.cs304project.MotorTraffic.repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceImpl implements LoginUserService{

    @Autowired
    private LoginUserRepository loginUserRepository;

    @Override
    public LoginUser saveLoginUser(LoginUser loginUser) {
        return loginUserRepository.save(loginUser);
    }
}
