package com.example.sayehwebservices.services.dto;

import lombok.Data;

@Data
public class IBANValidationRequest {
    String IBAN;
    String nationalCode;
}
