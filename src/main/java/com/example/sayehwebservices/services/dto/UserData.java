package com.example.sayehwebservices.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class UserData {
    List<String> role;
    String iat;
    String exp;
}
