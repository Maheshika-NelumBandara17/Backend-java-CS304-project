package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Complain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplainRepository extends JpaRepository<Complain, Integer> {
}
