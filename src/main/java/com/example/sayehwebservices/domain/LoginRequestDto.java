package com.example.sayehwebservices.domain;

import lombok.Data;

@Data
public class LoginRequestDto {
    String password;
    String userName;
}
