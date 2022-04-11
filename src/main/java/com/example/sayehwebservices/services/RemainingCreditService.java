package com.example.sayehwebservices.services;

import com.example.sayehwebservices.domain.RemainingCredit;
import com.example.sayehwebservices.repository.RemainingCreditRepository;
import com.example.sayehwebservices.services.dto.RemainingCreditResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemainingCreditService {

    @Autowired
    RemainingCreditRepository remainingCreditRepository;

    public RemainingCreditResponse findByNationalCode(String nationalCode) {
        RemainingCredit credit = remainingCreditRepository.findByF01Ncode(nationalCode);
        return new RemainingCreditResponse(credit);
    }
}
