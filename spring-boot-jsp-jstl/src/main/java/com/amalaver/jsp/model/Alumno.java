package com.amalaver.jsp.model;

public class Alumno {

	private int idAlumno;
	private String nombres;
	private String apellidos;

	public Alumno(int idAlumno, String nombres, String apellidos) {
		super();
		this.idAlumno = idAlumno;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
