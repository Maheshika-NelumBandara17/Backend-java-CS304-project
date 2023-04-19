//package com.cs304project.MotorTraffic.security;
//
//import com.cs304project.MotorTraffic.model.Users;
//import com.cs304project.MotorTraffic.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<Users> user = userRepository.findByNic(username);
//        return user.map(UserDetailsImpl::new)
//                .orElseThrow(()-> new UsernameNotFoundException("user not found"));
//    }
//}
