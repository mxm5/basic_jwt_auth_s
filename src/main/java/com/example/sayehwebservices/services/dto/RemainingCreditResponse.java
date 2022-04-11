package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.RemainingCredit;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RemainingCreditResponse {

    private String nationalCode;
    private Long remainCredit;
    private LocalDateTime lastTransactionDateTime;

    public RemainingCreditResponse(RemainingCredit credit) {
        if (credit!=null) {
            nationalCode = credit.getF01Ncode();
            remainCredit = credit.getF03Remcredit();
            lastTransactionDateTime = credit.getF04Lastdate();
        } else nationalCode = "not found";
    }
}
