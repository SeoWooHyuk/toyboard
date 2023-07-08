package com.restfulproject.toyboard.member.exception;

import org.springframework.http.HttpStatus;

public class MemberException extends RuntimeException {
    //RuntimeException 검사되지 않은 예외(unchekced exception)

    private HttpStatus status;

    public MemberException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
