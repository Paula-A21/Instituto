package Calendario;

//El curso debe tener anotado un mínimo de 3 alumnos inscriptos para
//guardarse en el calendario. Composicion con cursos o alumnos, por verse.
//crear una nueva clase para regular los alumnos que se inscriben a los cursos.

public class FechaDeInicio {

	private String anotarFechaDeIncio; // hacer una coleccion que se una con el total de cursos, cuando
	// se agregue un nuevo curso se agrega una nueva fecha
	
	public FechaDeInicio(String anotarFechaDeIncio) {
		this.anotarFechaDeIncio = anotarFechaDeIncio;
	}

	public String getAnotarFechaDeIncio() {
		return anotarFechaDeIncio;
	}

	public void setAnotarFechaDeIncio(String anotarFechaDeIncio) {
		this.anotarFechaDeIncio = anotarFechaDeIncio;
	}
	
	
}
