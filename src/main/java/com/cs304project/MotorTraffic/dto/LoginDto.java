package com.cs304project.MotorTraffic.dto;

public class LoginDto {
    private String nic;

    private String password;


    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}