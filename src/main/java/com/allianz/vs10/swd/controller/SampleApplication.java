package com.allianz.vs10.swd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.allianz.vs10.security.service.SecurityTestApplication;

@Controller
public class SampleApplication {

	private SecurityTestApplication securityTestApplication=new SecurityTestApplication() ;
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String getWelcomeMessaage()
	{
		return "Hello Weclome to VS10 2.0 SWD Application"+securityTestApplication.getMessage();
	}
}
