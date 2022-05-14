package com.example.sayehwebservices.services;

import com.example.sayehwebservices.services.dto.IBANValidationRequest;
import com.example.sayehwebservices.services.dto.IBANValidationResponseDto;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IBANValidationService {

    // todo : fix this for real data
    public IBANValidationResponseDto validateIBANForNationalCode(IBANValidationRequest IBANRequest) {


        if (Math.random()<0.8)
            return new IBANValidationResponseDto(
                    "این کد ملی متعلق به این شماره شبا است",
                    1, true
            );
        else
            return new IBANValidationResponseDto(
                    "خطا! این کد ملی برای این شماره شبا نادرست است",
                    0, false
            );

    }

}
