package com.example.sayehwebservices.services.dto;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@ToString
public class DepositReportRequest {
    Date start;
    Date end;
    String nationalCode;
    Integer offset;
    Integer size;
}



