package com.restfulproject.toyboard.member.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberToken {
    private Integer seq;
    private String id;
    private String token;
    private Date expiration;
    private String createdat;
    private String updatedat;

    public MemberToken() {
    }

    public MemberToken(Integer seq, String id, String token, Date expiration, String createdat, String updatedat) {
        super();
        this.seq = seq;
        this.id = id;
        this.token = token;
        this.expiration = expiration;
        this.createdat = createdat;
        this.updatedat = updatedat;
    }

    @Override
	public String toString() {
		return "token{" +
			"id='" + id + '\'' +
			", pwd='" + token + '\'' +
			", name='" + expiration + '\'' +
			", email='" + createdat + '\'' +
			", email='" + updatedat + '\'' +
			'}';
	}

    



    
}
