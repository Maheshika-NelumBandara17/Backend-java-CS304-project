package com.cs304project.MotorTraffic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long video;
    private String status;
    private String location;

    public Complain() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVideo() {
        return video;
    }

    public void setVideo(long video) {
        this.video = video;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
