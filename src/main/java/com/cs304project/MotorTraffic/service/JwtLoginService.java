package com.cs304project.MotorTraffic.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtLoginService {

    private String SecretKey = "MySecretKeyMySecretKeyMySecretKeyMySecretKeyMySecretKeyMySecretKeyMySecretKeyMySecretKeyMySecretKeyMySecretKey";

    public String generateToken(String nic) {
        Map<String , Object> claims = new HashMap<>();
    return createToken(claims,nic);
    }

    private String createToken(Map<String,Object> claims , String userName){
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000*60*60)) //1hour
                .signWith(getSignedKey() , SignatureAlgorithm.HS256).compact();
    }

    private Key getSignedKey(){
        byte[] bytes = Decoders.BASE64.decode(SecretKey);
        return Keys.hmacShaKeyFor(bytes);
    }

    public String extractUserName(String token) {
      return extractClaims(token , Claims :: getSubject);
    }

    private <T> T extractClaims(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
      return Jwts
              .parserBuilder()
              .setSigningKey(getSignedKey())
              .build()
              .parseClaimsJws(token)
              .getBody();
    }


    public boolean validateToken(String token, UserDetails userDetails) {
      final String name = extractUserName(token);
      return (name.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    public  Date extractExpiraction(String token){
        return extractClaims(token, Claims::getExpiration);
    }

    private boolean isTokenExpired(String token) {
    return extractExpiraction(token).before(new Date());
    }
}
