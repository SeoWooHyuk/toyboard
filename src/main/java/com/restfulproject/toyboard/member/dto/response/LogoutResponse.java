package com.restfulproject.toyboard.member.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutResponse {

    private String jwt;
    private String id;

    public LogoutResponse(String jwt, String id) {
        this.jwt = jwt;
        this.id = id;
    }

}
