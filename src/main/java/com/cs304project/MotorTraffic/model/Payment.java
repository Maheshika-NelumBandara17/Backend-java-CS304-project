package com.cs304project.MotorTraffic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private String firstName;
    private String lastName;
    private String nic_num;
    private String amount;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_observer_id")
    @JsonIgnore
    private Observer observer;


    public Payment() {
    }

    public Payment(String date, String firstName, String lastName, String nic_num, String amount, Observer observer) {
        this.date = date;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic_num = nic_num;
        this.amount = amount;
        this.observer = observer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic_num() {
        return nic_num;
    }

    public void setNic_num(String nic_num) {
        this.nic_num = nic_num;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }
}
