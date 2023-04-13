package com.cs304project.MotorTraffic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Policeman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String police_id;


    public Policeman() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolice_id() {
        return police_id;
    }

    public void setPolice_id(String police_id) {
        this.police_id = police_id;
    }
}
