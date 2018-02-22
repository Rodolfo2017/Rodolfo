package com.amalaver.jsp.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amalaver.jsp.model.Alumno;
import com.amalaver.jsp.model.Curso;
import com.amalaver.jsp.model.User;
import com.amalaver.jsp.service.UserService;

@RestController
public class UserRestService {

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/evaluacion/api/records", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, List<User>> devolverUsuarios(){
		Map<String, List<User>> data = new HashMap<>();
		data.put("data", userService.traerUsers());
		return data;
	}
	
	
	@GetMapping(value = "/evaluacion/api/records2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<List<User>> devolverUsuarios2(){
		List<List<User>> data = new ArrayList<>();
		data.add(userService.traerUsers());
		return data;
	}
	
	@GetMapping(value = "/evaluacion/api/records3", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, List<User>> devolverUsuarios3(String sname, String semail){
		System.out.println(sname);
		System.out.println(semail);
		Map<String, List<User>> data = new HashMap<>();
		data.put("data", userService.traerUsers());
		return data;
	}
	
	@GetMapping(value = "/evaluacion/api/records4/{sname}/{semail}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, List<User>> devolverUsuarios4(@PathVariable String sname, @PathVariable String semail){
		System.out.println(sname);
		System.out.println(semail);		
		Map<String, List<User>> data = new HashMap<>();
		data.put("data", userService.traerUsers());
		return data;
	}
	
	@GetMapping(value = "/evaluacion/api/curso", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Curso devolverCurso(){
		
		Alumno alumno = new Alumno(1, "Rainier", "Carbajal");
		Curso curso = new Curso(1, "Java", alumno);
		
		return curso;
	}
	
	
	
}
