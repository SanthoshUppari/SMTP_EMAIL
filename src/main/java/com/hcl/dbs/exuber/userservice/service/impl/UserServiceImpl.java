package com.hcl.dbs.exuber.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.hcl.dbs.exuber.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	Environment environment;

	@GetMapping("/port")
	@Override
	public String getPortNo() {
		String port = environment.getProperty("local.server.port");
		return "From User service : " + port;
	}

}
