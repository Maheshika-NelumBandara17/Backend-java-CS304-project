package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Policeman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicemanRepository extends JpaRepository<Policeman,Integer> {
}
