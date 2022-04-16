package com.example.sayehwebservices.Config.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    LocalDateTime time;
    String message;
    String Describtion;
//    String developerMessage;
}
