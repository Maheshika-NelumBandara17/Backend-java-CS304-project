package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
