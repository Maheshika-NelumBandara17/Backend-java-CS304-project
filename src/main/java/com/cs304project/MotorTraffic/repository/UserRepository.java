package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {

    Optional<Users> findByNic(String username);


}
