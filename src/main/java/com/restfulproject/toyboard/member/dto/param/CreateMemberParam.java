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
    private String bday;
    private String postcode;
    private String address;
    private String detailaddress;
    private String roles;


    public CreateMemberParam(JoinRequest req ,String encodedPwd, String roles) {
        this.id = req.getId();
        this.pwd = encodedPwd;
  	    this.name = req.getName();
        this.bday = req.getBday();
        this.postcode = req.getPostcode();
        this.address = req.getAddress();
        this.detailaddress = req.getDetailaddress();
        this.roles = roles;
    }

    public List<String> getRoleList(){
        if(this.roles.length()>0){
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }


}
