package com.restfulproject.toyboard.member.dto.request;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutRequest {
    
    @NotBlank
    private String id;

}
