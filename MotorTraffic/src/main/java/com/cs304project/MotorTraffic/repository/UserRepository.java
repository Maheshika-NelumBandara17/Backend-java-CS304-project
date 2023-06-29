package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
