package com.restfulproject.toyboard.member.dto.param;

import com.restfulproject.toyboard.member.dto.request.JoinRequest;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateMemberParam  {

    private String id;
    private String name;
    private String pwd;
    private String email;


    public CreateMemberParam(JoinRequest req ,String encodedPwd) {
        this.id = req.getId();
        this.pwd = encodedPwd;
  	    this.name = req.getName();
		this.email = req.getEmail();
    }


}
