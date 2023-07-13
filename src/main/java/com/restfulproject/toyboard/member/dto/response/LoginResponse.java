package com.restfulproject.toyboard.member.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {

    private String jwt;
    private String id;
    private Date expiration;
   

    public LoginResponse(String jwt, String id ,Date expiration) {
        this.jwt = jwt;
        this.id = id;
        this.expiration = expiration;
    }

}
