package gestion;

import Materiales.Aula;
import entidades.Alumno;
import entidades.Profesor;

public class Curso {
	
	private Aula aula;
	private Alumno alumno;
	private Profesor profesor;
	private String nombreDelCurso; 
	private String fechaDeInicio; 
	private String fechaDeFinalizacion;
	private char turno;
	private boolean aperturaDeInscripciones;

	public Curso(String nombreDelCurso, String fechaDeInicio, String fechaDeFinalizacion, char turno,
			boolean aperturaDeInscripciones) {
		
		this.nombreDelCurso = nombreDelCurso;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFinalizacion = fechaDeFinalizacion;
		this.turno = turno;
		this.aperturaDeInscripciones = aperturaDeInscripciones;
	}

	public String getNombreDelCurso() {
		return nombreDelCurso;
	}

	public void setNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}

	public String getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(String fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public String getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public boolean isAperturaDeInscripciones() {
		return aperturaDeInscripciones;
	}

	public void setAperturaDeInscripciones(boolean aperturaDeInscripciones) {
		this.aperturaDeInscripciones = aperturaDeInscripciones;
	}
	
	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	public Curso(Profesor profesor) {
		this.profesor = profesor;
	}

	public Curso(Alumno alumno) {
		this.alumno = alumno;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
}
