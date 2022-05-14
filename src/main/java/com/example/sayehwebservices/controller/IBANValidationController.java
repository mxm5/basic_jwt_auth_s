package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.services.IBANValidationService;
import com.example.sayehwebservices.services.dto.IBANValidationResponseDto;
import com.example.sayehwebservices.services.dto.IBANValidationRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/IBAN-validation")
@AllArgsConstructor
public class IBANValidationController {

    @Autowired
    IBANValidationService ibanValidationService;

    @PostMapping("/by-national-code-and-IBAN")
    IBANValidationResponseDto get(@RequestBody IBANValidationRequest IBANRequest) {
        return ibanValidationService.validateIBANForNationalCode(IBANRequest);
    }
}
