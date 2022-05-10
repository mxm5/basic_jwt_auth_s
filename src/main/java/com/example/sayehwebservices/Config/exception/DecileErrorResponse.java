package com.example.sayehwebservices.Config.exception;

import com.github.mfathi91.time.PersianDate;
import com.github.mfathi91.time.PersianDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class DecileErrorResponse {

    PersianDateTime timestamp;
    private String message;
    private int errorCode;

    public DecileErrorResponse(PersianDateTime timestamp, String message, int errorCode) {
        this.timestamp = timestamp;
        this.message = message;
        this.errorCode = errorCode;
    }
}
