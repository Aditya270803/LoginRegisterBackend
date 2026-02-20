package com.reglog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reglog.entity.Users;
import com.reglog.requests.LoginRequest;
import com.reglog.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	 final UserService userservice;

	 public UserController(UserService userservice) {
		this.userservice = userservice;
	 }
	 
	 @PostMapping("/addUser")
	 public Users addUser(@RequestBody Users user) {
		return  userservice.addUser(user);
	 }
	 
	 @PostMapping("/loginUser")
	 public Boolean loginUser(@RequestBody LoginRequest loginUser) {
		 return userservice.loginUser(loginUser);
	 }

}
