package com.restfulproject.toyboard.member.dto.request;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinRequest {

    @NotBlank
    private String id;

    @NotBlank
    private String pwd;

    @NotBlank
    private String checkPwd;

    @NotBlank
    private String name;

    @NotBlank
    private String bday;

    @NotBlank
    private String postcode;

    @NotBlank
    private String address;

    @NotBlank
    private String detailaddress;
}
