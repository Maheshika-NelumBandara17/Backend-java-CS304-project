package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.dto.UserDto;
import com.cs304project.MotorTraffic.model.Users;
import com.cs304project.MotorTraffic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public void createNewUser(UserDto userDto) {
        Users user = new Users(userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getNic(),
                userDto.getDistrict(),
                encoder.encode(userDto.getPassword()),
                userDto.getRole(),
                userDto.getPhone(),
                userDto.getAddress(),
                userDto.getEmail());
        userRepository.save(user);

    }
}
