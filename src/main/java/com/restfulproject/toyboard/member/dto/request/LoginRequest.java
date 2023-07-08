package com.restfulproject.toyboard.member.dto.request;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    @NotBlank
    private String id;

    @NotBlank
    private String pwd;
}
