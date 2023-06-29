package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser,Integer> {
}
