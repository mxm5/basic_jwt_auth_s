package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.Utils.JwtUtils;
import com.example.sayehwebservices.domain.*;
import com.example.sayehwebservices.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
@Slf4j
public class authController {

    UsersService usersService;

    AuthenticationManager authenticationManager;
    private UsersService userService;
    private JwtUtils jwtUtils;

    @PostMapping("/register")
    RegistrationResponseDto register(
            @RequestBody RegistrationRequestDto requestDto,
            HttpServletRequest request,
            HttpServletResponse response
    ) {

        String ip = request.getRemoteAddr();
        if (AllowedIps.ips.contains(ip)) {
            requestDto.setSenderIp(ip);
            return usersService.register(requestDto);
        } else throw new AccessDeniedException("only allowed ips can created admin users");
    }

    @PostMapping("/login")
    LoginResponseDto login(
            @RequestBody LoginRequestDto requestDto,
            HttpServletRequest request,
            HttpServletResponse response) {
        String userName = requestDto.getUserName();
        String password = requestDto.getPassword();
        String loginIpAddress = request.getRemoteAddr();
        try {
            log.info(userName);
            log.info(password);
            Authentication mmm = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            userName, password
                    )
            );

//            log.info(mmm.getName());
//            log.info(mmm.getCredentials().toString()); raising exception
//            log.info(mmm.getDetails().toString());
//            log.info(mmm.getPrincipal().toString());
//            log.info(mmm.toString());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(" bad credentials ");
        }

        UserDetails userDetails = userService.loadUserByUsername(userName);
        Users user = (Users) userDetails;

        LoginResponseDto responseDto = new LoginResponseDto();

        String s = jwtUtils.generateToken(user);
        responseDto.setToken(s);

        return responseDto;

    }


}
