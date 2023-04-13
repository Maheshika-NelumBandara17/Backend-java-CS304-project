package com.cs304project.MotorTraffic.security;

import com.cs304project.MotorTraffic.model.Users;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {

    private String nic;
    private String password;
    private String firstName;
    private String lastName;
    private String district;
    private String role;
    private String phone;
    private String address;
    private String email;
    private static List<GrantedAuthority> authorities;

    public UserDetailsImpl(Users user) {
        nic = user.getNic();
        password = user.getPassword();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        phone = user.getPhone();
        address = user.getAddress();
        district = user.getDistrict();
        role = user.getRole();
        authorities = Arrays.asList(user.getRole()).stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());


    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nic;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDistrict() {
        return district;
    }

    public String getRole() {
        return role;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}