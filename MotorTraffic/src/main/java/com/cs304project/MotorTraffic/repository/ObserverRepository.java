package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Observer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObserverRepository extends JpaRepository<Observer,Integer> {
}
