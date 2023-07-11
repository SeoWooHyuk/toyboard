package com.restfulproject.toyboard.member.dto.param;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateMemberTokenParam {

    private Integer seq;
    private String id;
    private String token;
    private Date expiration;
    private String createdat;
    private String updatedat;

    public CreateMemberTokenParam() {
    }

    public CreateMemberTokenParam( String id, String token, Date expiration) {
        this.id = id;
        this.token = token;
        this.expiration = expiration;
    }

    

}
