package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.model.User;
import com.cs304project.MotorTraffic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
