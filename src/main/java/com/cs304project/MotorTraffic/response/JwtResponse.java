package com.cs304project.MotorTraffic.response;

public class JwtResponse {

    private String token;
    private String firstName;
    private String lastName;
    private String nic;
    private String district;
    private String password;
    private String role;
    private String phone;
    private String address;
    private String email;


    public JwtResponse() {
    }

    public JwtResponse(String token, String firstName, String lastName, String nic, String district, String password, String role, String phone, String address, String email) {
        this.token = token;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.district = district;
        this.password = password;
        this.role = role;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


