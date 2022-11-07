package com.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.app.dto.AdminDto;
import com.quiz.app.entity.AdminEntity;
import com.quiz.app.service.AdminService;


@RestController
@RequestMapping("/api/auth/admin/")
public class AdminController {

	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/singup")
	public AdminEntity singup(@RequestBody AdminDto singupDto){
		
		return adminService.singup(singupDto);

	}

	@CrossOrigin
	@PostMapping("/login")
	public AdminEntity login(@RequestBody AdminDto loginDto) {
		return adminService.login(loginDto);

	}

	
}
