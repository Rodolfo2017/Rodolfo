package com.amalaver.jsp.model;

public class Curso {

	private int idCurso;
	private String nombre;
	private Alumno alumno;

	public Curso(int idCurso, String nombre, Alumno alumno) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.alumno = alumno;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
