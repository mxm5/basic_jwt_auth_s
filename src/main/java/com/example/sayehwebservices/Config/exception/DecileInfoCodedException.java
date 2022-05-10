package com.example.sayehwebservices.Config.exception;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class DecileInfoCodedException extends Throwable {
    private String msg;
    private int errorCode;
    public DecileInfoCodedException(String msg) {
        super(msg);
    }

    public DecileInfoCodedException(String msg, int errorCode) {
        super(msg);
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public DecileInfoCodedException(String message, String msg, int errorCode) {
        super(message);
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public DecileInfoCodedException(String message, Throwable cause, String msg, int errorCode) {
        super(message, cause);
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public DecileInfoCodedException(Throwable cause, String msg, int errorCode) {
        super(cause);
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public DecileInfoCodedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String msg, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = msg;
        this.errorCode = errorCode;
    }
}
