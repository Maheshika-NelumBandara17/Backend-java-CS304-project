//package com.cs304project.MotorTraffic.security;
//
//import com.cs304project.MotorTraffic.model.Users;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class UserDetailsImpl implements UserDetails {
//
//    private String nic;
//    private String password;
//    private List<GrantedAuthority> authorities;
//
//    public UserDetailsImpl(Users user) {
//        nic=user.getNic();
//        password= user.getPassword();
//        authorities = Arrays.asList(user.getRole()).stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
//    }
//
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return nic;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}