package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.services.CreditService;
import com.example.sayehwebservices.services.dto.RemainingCreditRequest;
import com.example.sayehwebservices.services.dto.RemainingCreditResponse;
import com.example.sayehwebservices.services.dto.TXReportRequest;
import com.example.sayehwebservices.services.dto.TXReportResponse;
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
    CreditService creditService;



    @PostMapping("/remaining-credit-by-national-code")
    RemainingCreditResponse getRemainingCredit(@RequestBody RemainingCreditRequest request) {
        return creditService.getRemainingCreditFor(request.getNationalCode());
    }


    @PostMapping("/transactions-report-by-date-time-for-national-code")
    TXReportResponse getReportForPerson(@RequestBody TXReportRequest request) throws Exception {
        return creditService.getReportsFor(request);
    }



}
