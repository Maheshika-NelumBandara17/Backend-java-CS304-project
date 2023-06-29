package com.cs304project.MotorTraffic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Observer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Observer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
