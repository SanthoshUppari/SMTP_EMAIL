package com.hcl.dbs.exuber.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dbs.exuber.userservice.service.UserService;


@RestController
@RequestMapping("/public")
public class PublicUserController {

	@Autowired
	UserService userService;

	@GetMapping("/port")
	public String getPortNo() {
		String portNum = userService.getPortNo();
		return "Public " + portNum;
	}

}
