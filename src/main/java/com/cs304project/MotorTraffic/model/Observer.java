package com.cs304project.MotorTraffic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "observer")
    @JsonIgnore
    private List<Payment> payments= new ArrayList<>();

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

}
