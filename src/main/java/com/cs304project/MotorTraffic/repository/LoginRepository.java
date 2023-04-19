package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface LoginRepository extends JpaRepository<Users, Integer> {
        //findby can return multiple results while findOneBy will return a single results or null
      Users findOneByNicIgnoreCaseAndPassword(String nic,String password);
    }

