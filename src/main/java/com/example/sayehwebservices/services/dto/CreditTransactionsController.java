package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.controller.TXReportRequest;
import com.example.sayehwebservices.domain.RemainingCredit;
import com.example.sayehwebservices.services.RemainingCreditService;
import com.example.sayehwebservices.services.dto.RemainingCreditRequest;
import com.example.sayehwebservices.services.dto.RemainingCreditResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/balance")
@AllArgsConstructor
@Slf4j
public class CreditTransactionsController {

    @Autowired
    RemainingCreditService remainingCreditService;



    @PostMapping("/remaining-credit-by-national-code")
    RemainingCreditResponse getRemainingCredit(@RequestBody RemainingCreditRequest request) {
        return remainingCreditService.findByNationalCode(request.getNationalCode());
    }


    @PostMapping("/transactions-report-by-date-time-for-national-code")
   TXReportResponse  getReportForPerson(@RequestBody TXReportRequest request) throws Exception {

        return remainingCreditService.getReportsFor(request);
    }



}
