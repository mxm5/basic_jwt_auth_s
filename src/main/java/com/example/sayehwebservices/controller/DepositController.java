package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.domain.SettledDeposit;
import com.example.sayehwebservices.services.DepositService;
import com.example.sayehwebservices.services.dto.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/deposit")
@AllArgsConstructor
@Slf4j
public class DepositController {

    @Autowired
    DepositService depositService;

    @PostMapping("/deposit-for-national-code-between-two-dates")
    DepositResponseDto getDepositForPerson(@RequestBody DepositReportRequest request) throws Exception {
        DepositResponseDto allDeposits = null;
        return depositService.getAllDeposits(request);

    }


}
