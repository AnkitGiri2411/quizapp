package com.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.app.dto.UserDto;
import com.quiz.app.entity.UserEntity;
import com.quiz.app.service.UserService;

@RestController
@RequestMapping("/api/auth/user/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/singup")
	public UserEntity singup(@RequestBody UserDto singupDto){
		
		return userService.singup(singupDto);

	}

	@CrossOrigin
	@PostMapping("/login")
	public UserEntity login(@RequestBody UserDto loginDto) {
		return userService.login(loginDto);

	}

}
