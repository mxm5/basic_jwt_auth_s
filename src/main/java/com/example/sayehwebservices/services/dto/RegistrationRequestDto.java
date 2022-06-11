package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.Roles;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class RegistrationRequestDto {


    transient private String senderIp;

    private String password;

    private String email;

    private String userName;

    private String firstName;

    private String lastName;

    private Set<Roles> roleses = new LinkedHashSet<>();
}

