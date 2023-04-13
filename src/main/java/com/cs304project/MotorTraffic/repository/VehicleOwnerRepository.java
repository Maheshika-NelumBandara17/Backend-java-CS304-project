package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, Integer> {
}
