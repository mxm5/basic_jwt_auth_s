package com.example.sayehwebservices.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;


@Component
@RequiredArgsConstructor
@Slf4j
public class AuthenticationEntryPointHandler implements AuthenticationEntryPoint {


    @Override
    public void commence(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            AuthenticationException e)
            throws IOException {

        log.error("httpServletRequest::" + httpServletRequest.toString());
        log.error("httpServletResponse::" + httpServletResponse.toString());
        e.printStackTrace();
        log.error("authenticationException::" + e);
        HttpHeaders headers = new HttpHeaders();
        String authorization = httpServletRequest.getHeader("Authorization");
        String remoteAddress = httpServletRequest.getRemoteAddr();
        ResponseEntity<String> response =
                new ResponseEntity<>(
                        "error msg: " + e.getMessage() +
                                ",cause: " + Arrays.toString(e.getStackTrace()) +
                                ",auth: " + authorization +
                                ",remoteAddress: " + remoteAddress,
                        headers,
                        HttpStatus.FORBIDDEN);
        OutputStream out = httpServletResponse.getOutputStream();
        ObjectMapper mapper = new ObjectMapper();
        httpServletResponse.setStatus(403);
        httpServletResponse.setContentType("application/json");
        mapper.writeValue(out, response);
        out.flush();
    }
}