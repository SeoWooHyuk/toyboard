package com.restfulproject.toyboard.member.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member{

    private String id;
    private String pwd;
    private String name;
	private String email;
	private String roles;
    
    public Member() {}

    public Member(String id, String pw, String name, String email, String roles ,int auth) {
        super();
        this.id = id;
        this.pwd = pw;
  	    this.name = name;
		this.email = email;
		this.roles = roles;
    }

    @Override
	public String toString() {
		return "User{" +
			"id='" + id + '\'' +
			", pwd='" + pwd + '\'' +
			", name='" + name + '\'' +
			", email='" + email + '\'' +
			", email='" + roles + '\'' +
			'}';
	}



}
