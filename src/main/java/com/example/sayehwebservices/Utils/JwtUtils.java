package com.example.sayehwebservices.Utils;

import com.example.sayehwebservices.domain.security.Users;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.springframework.stereotype.Service;


import java.time.Instant;
import java.util.Date;
import java.util.Map;

@Service
public class JwtUtils {

    private final String SECRET = "CT3DUq9CZg3xHJ0P1@3iC3&sFLhiWRhq";

    public String generateToken(Users user) {
        // after 15 minutes expires
        long EXPIRED = 900_000L; // in miliseconds

        Map<String, Object> claim=Map.of(
                "userRole","killer","height","100"
        );
        return "Bearer " + Jwts.builder().setSubject(user.getUserSubject())
                .setIssuedAt(Date.from(Instant.now()))
//                .setPayload("x")// raised error [[Both 'payload' and 'claims' cannot both be specified]]
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRED))
//                .setClaims(claim)// overrids all the payload
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();

    }

    public String getSubject(String token) {
        return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();

    }

}

