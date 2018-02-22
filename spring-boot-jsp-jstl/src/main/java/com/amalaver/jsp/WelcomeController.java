package com.amalaver.jsp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {
	
	@Value("${message}")
	private String message;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String   welcome(Map<String, Object> model) {
		model.put("message", this.message);
		List<Persona> lista = Arrays.asList(new Persona(1, "Rainier", "Carbajal", "123456789", "Av. Pepito dos cañones"),
											new Persona(2, "Aldo", "Malaver", "44131203", "Av. Cuca ardilosas"),
											new Persona(3, "Pepito", "Perez", "3493939", "Av. Las papayas 666"));
		
		model.put("lista", lista);
		return "welcome";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String guardarPersona(String nombres, String apellidos, String direccion, String telefono, Map<String, Object> model, HttpServletRequest request) {
		System.out.println(request.getParameter("nombres"));
		System.out.println(nombres);
		System.out.println(direccion);
		System.out.println(apellidos);
		System.out.println(telefono);
		model.put("nombres", nombres);
		model.put("apellidos", apellidos);
		model.put("telefono", telefono);
		model.put("direccion", direccion);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("nombres", nombres);
		return "usuario";
	}
	
	@RequestMapping(value="/usuario", method = RequestMethod.POST)
	public String retornarWelcome(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		model.put("message", session.getAttribute("nombres"));
		System.out.println(session.getAttribute("nombres"));
		response.sendRedirect("/usuario.jsp");
		return "welcome";
	}
	
	

}

