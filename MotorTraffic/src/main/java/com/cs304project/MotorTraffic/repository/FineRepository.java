package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Fine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FineRepository extends JpaRepository<Fine, Integer> {
}
