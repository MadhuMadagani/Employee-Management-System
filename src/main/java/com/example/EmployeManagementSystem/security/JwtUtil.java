package com.example.EmployeManagementSystem.security;


import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {
	
	private final String secret = "mysupersecretkeymysupersecretkey";
//atleast 32 characters	
	private Key getSignKey() {
		return Keys.hmacShaKeyFor(secret.getBytes());
	}
	public String generateToken(String username) {
		return Jwts.builder()
		.setSubject(username)
		.setIssuedAt(new Date())
		.setExpiration(new Date(System.currentTimeMillis()+86400000))
		.signWith(getSignKey())
		.compact();
	}	
	
	public String extractUsername(String token) {
		return Jwts.parserBuilder()
				.setSigningKey(getSignKey())
				.build()
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
	}
       public boolean validateToken(String token) {
    	   try {
    		   Jwts.parserBuilder()
    		   .setSigningKey(getSignKey())
    		   .build()
    		   .parseClaimsJws(token);
    		   return true;
    	   } catch(Exception e) {
    		   return false;
    	   }
       }
}
