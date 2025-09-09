package com.example.furniture_ecommerce.utill;

import java.security.Key;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;


@Component
public class JwtUtil {

private Key signinKey;

public JwtUtil(@Value("${jwt.secret}") String secretKey) {
byte[] decode = Base64.getDecoder().decode(secretKey);
this.signinKey = Keys.
}

public String generateToken(String username) {
return Jwts.builder()
.setSubject(username)
.setIssuedAt(new Date())
.setExpiration(new Date(System.currentTimeMillis() + 86400000))
.signWith(signinKey)
.compact();

}
public String extractUsername(String token) {
Claims claims = Jwts.parserBuilder()
.setSigningKey(signinKey)
.build()
.parseClaimsJws(token)
.getBody();
return claims.getSubject();
}
}