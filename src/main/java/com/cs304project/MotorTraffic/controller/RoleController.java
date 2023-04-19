package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.model.Role;
import com.cs304project.MotorTraffic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class RoleController {
    @Autowired
    public RoleService roleService;

    //@GetMapping
   // public List<Role> getAllRoles(){
       // return roleService.getAllRoles();
  //  }
    //@GetMapping("{id}")
    //public String getRoleName(@PathVariable int id){
        //return roleService.getRoleName(id);
    //}

}
