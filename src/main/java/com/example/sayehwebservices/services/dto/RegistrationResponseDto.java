package com.example.sayehwebservices.services.dto;


import com.example.sayehwebservices.domain.security.Roles;
import com.example.sayehwebservices.domain.security.Users;
import lombok.Data;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class RegistrationResponseDto {

    private Long id;

    private String password;

    private String email;

    private String userName;

    private String firstName;

    private String lastName;

    private Date creationDate;

    private String ip;

    private Set<Roles> roleses = new LinkedHashSet<>();

    private String typedPass;

    public RegistrationResponseDto(Users save, String ip, String pass) {
        id = save.getId();
        password = save.getPassword();
        email = save.getEmail();
        userName = save.getUsername();
        firstName = save.getFirstName();
        lastName = save.getLastName();
        creationDate = save.getCreationDate();
        roleses = save.getRoleses();
        this.ip = ip;
        typedPass = pass;
    }
}
