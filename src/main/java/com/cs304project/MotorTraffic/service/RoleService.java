package com.cs304project.MotorTraffic.service;

import com.cs304project.MotorTraffic.model.Role;
import com.cs304project.MotorTraffic.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;

public class RoleService {
   @Autowired
    RoleRepository roleRepo;

    //public String getRoleName(int id){
      //  Role role = roleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id " +id));

        //return role.getRoleName();
    //}
    //public List<Role> getAllRoles(){
        //return roleRepo.findAll();
    }
