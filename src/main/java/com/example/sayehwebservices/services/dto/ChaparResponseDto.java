package com.example.sayehwebservices.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChaparResponseDto {
    String message ;
    String nationalCode;
    String status;
}
