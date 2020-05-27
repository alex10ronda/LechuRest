package com.lechuguita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechuguita.dao.UserRepositorio;

@Service
public class UserServiceImpl {
	
	@Autowired
	public UserRepositorio userRepositorio;
	
	public void nombre(){
		userRepositorio.count();
	}

}
