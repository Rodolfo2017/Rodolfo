package com.amalaver.jsp.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amalaver.jsp.model.User;
import com.amalaver.jsp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> traerUsers() {
		return generateData();
	}
	
	private List<User> generateData(){
		
		return Arrays.asList(new User(1, "Pepito", 25, "axyz@fuck.com", "66666666", new Date().getYear() - 25),
							new User(2, "Juan", 45, "juanc@fuck.com", "66666666", new Date().getYear() - 25));
	}

}
