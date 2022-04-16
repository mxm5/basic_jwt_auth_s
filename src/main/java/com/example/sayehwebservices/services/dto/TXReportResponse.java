package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TXReportResponse {
    Integer total;
    List<Transaction> transactionList;
}
