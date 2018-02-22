package com.amalaver.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {

	private static final long serialVersionUID = 4716178580749551870L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("entro");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	}

}
