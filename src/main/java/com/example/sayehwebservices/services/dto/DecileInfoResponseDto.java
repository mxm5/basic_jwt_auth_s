package com.example.sayehwebservices.services.dto;

import com.github.mfathi91.time.PersianDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DecileInfoResponseDto {
    String  timestamp;
    private String message;
    private int responseCode;
    private String decileRange;
}
