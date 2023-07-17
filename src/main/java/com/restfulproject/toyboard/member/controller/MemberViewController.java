package com.restfulproject.toyboard.member.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberViewController {
    

	@RequestMapping(value="/")
	public String index() {
		return "index";
	}  

	@RequestMapping(value="/map")
	public String map() {
		return "map";
	}
	
	
}
