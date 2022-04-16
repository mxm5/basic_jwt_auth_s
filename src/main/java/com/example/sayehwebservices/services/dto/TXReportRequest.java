package com.example.sayehwebservices.services.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TXReportRequest {
    LocalDateTime start;
    LocalDateTime end;
    String nationalCode;
    Integer offset;
    Integer size;
}
