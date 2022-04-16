package com.example.sayehwebservices.services;

import com.example.sayehwebservices.services.dto.TXReportRequest;
import com.example.sayehwebservices.domain.RemainingCredit;
import com.example.sayehwebservices.domain.Transaction;
import com.example.sayehwebservices.repository.RemainingCreditRepository;
import com.example.sayehwebservices.repository.TransactionRepository;
import com.example.sayehwebservices.services.dto.RemainingCreditResponse;
import com.example.sayehwebservices.services.dto.TXReportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

@Service
public class CreditService {

    @Autowired
    RemainingCreditRepository remainingCreditRepository;

    @Autowired
    TransactionRepository transactionRepository;

    public RemainingCreditResponse getRemainingCreditFor(String nationalCode) {
        RemainingCredit credit = remainingCreditRepository.findByF01Ncode(nationalCode);
        return new RemainingCreditResponse(credit);
    }

    public TXReportResponse getReportsFor(TXReportRequest request) throws Exception {

        if (request.getStart().isAfter(request.getEnd()))
            throw new Exception("start is after end date");
        TemporalUnit days = ChronoUnit.DAYS;
        if (request.getStart().plus(30, days).isBefore(request.getEnd()))
            throw new Exception("the maximum duration should be 30 days");
        Page<Transaction> listOfTransactions = transactionRepository.findByF05TxLocaldatBetweenAndF01NcodeIs(
                request.getStart(), request.getEnd(), request.getNationalCode(), PageRequest.of(
                        request.getOffset(), request.getSize()
                )
        );
        return new TXReportResponse(
                listOfTransactions.getContent().size(),
                listOfTransactions.getContent()

        );

    }
}
