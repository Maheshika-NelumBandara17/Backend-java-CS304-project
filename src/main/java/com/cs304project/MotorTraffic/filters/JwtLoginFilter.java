package com.cs304project.MotorTraffic.filters;

import com.cs304project.MotorTraffic.security.CustomUserDetailsService;
import com.cs304project.MotorTraffic.service.JwtLoginService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtLoginFilter extends OncePerRequestFilter {

    @Autowired
    private JwtLoginService jwtLoginService;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = request.getHeader("Authorization");
        String token = null;
        String nic = null;

        if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer")){
            token = authorizationHeader.substring(7);
            nic =  jwtLoginService.extractUserName(token);
        }

        if (nic!= null && SecurityContextHolder.getContext().getAuthentication() == null){
            UserDetails userDetails = userDetailsService.loadUserByUsername(nic);
            if (jwtLoginService.validateToken(token , userDetails)){
                UsernamePasswordAuthenticationToken auth =  new UsernamePasswordAuthenticationToken(userDetails , null, userDetails.getAuthorities());
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }
        filterChain.doFilter(request, response);
    }



}
