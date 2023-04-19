package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.dto.UserDto;
import com.cs304project.MotorTraffic.model.Users;
import com.cs304project.MotorTraffic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createNewUser(UserDto userDto) {


        Users user = new Users (userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getNic(),
                userDto.getDistrict(),
                userDto.getPassword(),
                userDto.getRole(),
                userDto.getPhone(),
                userDto.getAddress(),
                userDto.getEmail());
        userRepository.save(user);

    }

    public void updateUserDetails( String firstName, String lastName, String address, String phone, String district, String email) {

        Users user = userRepository.getUserByNic(email);

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);
        user.setPhone(phone);
        user.setDistrict(district);
        user.setEmail(email);
    }
}


