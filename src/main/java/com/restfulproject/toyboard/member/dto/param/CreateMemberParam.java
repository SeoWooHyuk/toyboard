package com.restfulproject.toyboard.member.dto.param;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    private String roles;


    public CreateMemberParam(JoinRequest req ,String encodedPwd, String roles) {
        this.id = req.getId();
        this.pwd = encodedPwd;
  	    this.name = req.getName();
		this.email = req.getEmail();
        this.roles = roles;
    }

    public List<String> getRoleList(){
        if(this.roles.length()>0){
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }


}
