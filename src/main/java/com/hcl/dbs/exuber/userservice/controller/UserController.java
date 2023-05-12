package com.hcl.dbs.exuber.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dbs.exuber.userservice.service.UserService;
import com.hcl.dbs.exuber.userservice.service.impl.EmailServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	EmailServiceImpl emailServiceImpl;

	@GetMapping("/port")
	public String getPortNo() {
		return userService.getPortNo();
	}
	
	@GetMapping("/sendmail")
	public String sendEMail() {
		emailServiceImpl.sendEmail("uppari.santhosh@gmail.com", "my subject", "test body");
		return "Success";	
	}
}
