package com.cs304project.MotorTraffic.repository;

import com.cs304project.MotorTraffic.model.Complain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ComplainRepository extends JpaRepository<Complain, Integer> {


    @Transactional
    void deleteComplainById(int id);
}
