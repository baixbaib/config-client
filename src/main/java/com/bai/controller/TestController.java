package com.bai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${profile}")
	private String profile;
	
	@RequestMapping("/profile")
	public String profile() {
		
		return "current profile is : " + this.profile;
	}
}
