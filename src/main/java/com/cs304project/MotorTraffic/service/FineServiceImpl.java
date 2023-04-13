package com.cs304project.MotorTraffic.service;


import com.cs304project.MotorTraffic.model.Fine;
import com.cs304project.MotorTraffic.repository.FineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FineServiceImpl implements FineService{

    @Autowired
    private FineRepository fineRepository;

    @Override
    public Fine saveFine(Fine fine){
        return fineRepository.save(fine);
    }
}
