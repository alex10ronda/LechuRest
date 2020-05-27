package com.lechuguita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lechuguita.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	public UserServiceImpl userService;
	
	@GetMapping(value="/get1")
	public String get(){
		userService.nombre();
		return "Hola";
	}

}
